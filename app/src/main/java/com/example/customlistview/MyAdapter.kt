package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mCntx: Context,var resources:Int,val items:List<Model>):ArrayAdapter<Model>(mCntx,resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCntx)
        val view: View =layoutInflater.inflate(resources, null)
        val imaageview: ImageView =view.findViewById(R.id.img)
        val titletextview: TextView =view.findViewById(R.id.txt_main)
        val descriptiontextview: TextView =view.findViewById(R.id.txt_subtext)
        var myitem:Model=items[position]
        imaageview.setImageDrawable(mCntx.resources.getDrawable(myitem.img))
        titletextview.text=myitem.title
        descriptiontextview.text=myitem.description
        return super.getView(position, convertView, parent)
    }
}