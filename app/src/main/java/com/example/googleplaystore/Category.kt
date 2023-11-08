package com.example.googleplaystore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Category(private val categoryList: List<String>) : RecyclerView.Adapter<Category.MyViewHolder>() {
    class MyViewHolder(private val row: View) : RecyclerView.ViewHolder(row) {
        val textView: TextView = row.findViewById(R.id.number)
        val horizontalRecyclerView: RecyclerView = row.findViewById(R.id.horizontalRecyclerView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(
            R.layout.category_app,
            parent, false)
        return MyViewHolder(layout)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val categoryName = categoryList[position]
        holder.textView.text = categoryName

        val innerAdapter = App(categoryList)
        holder.horizontalRecyclerView.apply {
            layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = innerAdapter
        }
    }
    override fun getItemCount(): Int = categoryList.size
}