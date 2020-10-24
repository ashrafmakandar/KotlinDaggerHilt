package com.kalyani.todos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kalyani.todos.R
import com.kalyani.todos.model.TodrespnseItem

class adapt(var context: Context, var list: List<TodrespnseItem>) :
    RecyclerView.Adapter<adapt.todohlder>() {


    class todohlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text = itemView.findViewById<TextView>(R.id.one)
        var text2 = itemView.findViewById<TextView>(R.id.two)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todohlder {
        var view = LayoutInflater.from(context).inflate(R.layout.tod_items, parent, false)
        return todohlder(view)
    }

    override fun onBindViewHolder(holder: todohlder, position: Int) {

            holder.text.text = list[position].id
            holder.text2.text =list[position].title


    }

    override fun getItemCount(): Int {
        return list.size
    }
}