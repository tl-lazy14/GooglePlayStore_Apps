package com.example.googleplaystore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val categoryList = listOf(
    "Top Free Apps",
    "For Your Free Time",
    "Popular Apps",
    "Capture Memories",
    "For City Living",
    "Travel Smart"
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = Category(categoryList)
    }
}