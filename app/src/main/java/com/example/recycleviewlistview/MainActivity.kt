package com.example.recycleviewlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    val list_menu = arrayListOf<String>(
        "테스트1",
        "테스트2",
        "테스트3",
        "테스트4",
        "테스트5",
        "테스트6",
        "테스트7",
        "테스트8",
        "테스트9",
        "테스트10",
        "테스트11",
        "테스트12",
        "테스트13",
        "테스트14", "테스트15", "테스트16", "테스트17", "테스트18", "테스트19",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list_menu)

        val listview = findViewById<ListView>(R.id.ListView)
        listview.adapter = adapter

    }


}