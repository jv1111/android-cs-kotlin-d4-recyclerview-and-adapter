package com.example.d4_kotlin_recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val fruitsList:List<Fruit>,
    private val clickListener:(Fruit)->Unit //unit is equivalent to void
) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i("myTag", "onCreateViewHolder")
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        Log.i("myTag", "setting the size")
        return fruitsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("myTag", "onBind function")
        val fruit = fruitsList[position];
//        holder.myTextView.text = fruit.name
        holder.bind(fruit, clickListener)
    }

}

class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
//    val myTextView = view.findViewById<TextView>(R.id.tvName)
    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit){
        Log.i("myTag", "binding function")
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text = fruit.name
    //    add listener
    view.setOnClickListener{
        clickListener(fruit)
    }

}

}