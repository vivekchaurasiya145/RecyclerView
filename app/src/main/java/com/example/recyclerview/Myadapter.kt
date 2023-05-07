package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Myadapter(private var newlist: ArrayList<News>) : RecyclerView.Adapter<Myadapter.myViewHolder>() {




        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
            var itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            return myViewHolder(itemView)

        }

        override fun getItemCount(): Int {
            return newlist.size

        }

        override fun onBindViewHolder(holder: myViewHolder, position: Int) {

            val currentItem = newlist[position]
            holder.titleImage.setImageResource(currentItem.titleImage)
            holder.tvHeading.text = currentItem.heading

        }

    class myViewHolder(itemView: View) : ViewHolder(itemView) {
        val titleImage:ImageView=itemView.findViewById(R.id.title_image)
        val tvHeading:TextView = itemView.findViewById(R.id.tvHeading)
    }

}