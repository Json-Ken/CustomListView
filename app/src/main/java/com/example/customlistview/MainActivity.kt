package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listView)
        var mylist= mutableListOf<Model>()
        //lets add images,title and description
        mylist.add(Model("Blue","This is a blue car",R.drawable.kona))
        mylist.add(Model("Jeep","This is a SUV car",R.drawable.jeep))
        mylist.add(Model("Ferrari","This is a SUV car",R.drawable.ferrari))
        mylist.add(Model("Lamboghini","This is a SUV car",R.drawable.lambo))
        mylist.add(Model("Hyundai","This is a SUV car",R.drawable.c))
        listview.adapter=MyAdapter(this,R.layout.linearlayout,mylist)
    }
}