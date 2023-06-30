package com.example.d4_kotlin_recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
        Fruit("F1", "S1"),
        Fruit("F2", "S2"),
        Fruit("F3", "S3"),
        Fruit("F4", "S4"),
        Fruit("F5", "S5"),
        Fruit("F6", "S6"),
        Fruit("F7", "S7"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)//setting layout manager
        recyclerView.adapter = Adapter(fruitsList)
    }
}