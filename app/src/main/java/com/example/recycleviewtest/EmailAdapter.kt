package com.example.recycleviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class EmailAdapter(private val context: Context) :
    RecyclerView.Adapter<EmailAdapter.ViewHolder>() {

    var datas = mutableListOf<EmailData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent,false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size


    override fun onBindViewHolder(holder:ViewHolder,position: Int) {
        holder.bind(datas[position])
    }
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val textTitle: TextView = itemView.findViewById(R.id.title)
        private val textContent: TextView = itemView.findViewById(R.id.content)
        private val imgProfile: ImageView = itemView.findViewById(R.id.profile_image)

        fun bind(item: EmailData) {
            textTitle.text = item.title
            textContent.text = item.content


        }
    }

}