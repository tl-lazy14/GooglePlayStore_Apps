package com.example.googleplaystore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class App(private val data: List<String>) : RecyclerView.Adapter<App.InnerViewHolder>() {
    class InnerViewHolder(private val row: View) : RecyclerView.ViewHolder(row) {
        val imageView: ImageView = row.findViewById(R.id.itemImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.app_item, parent, false)
        return InnerViewHolder(layout)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.imageView.setImageResource(R.drawable.app_icon)
    }

    override fun getItemCount(): Int = data.size
}