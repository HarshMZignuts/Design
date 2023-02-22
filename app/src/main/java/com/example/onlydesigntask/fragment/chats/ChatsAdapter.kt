package com.example.onlydesigntask.fragment.chats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlydesigntask.R

class ChatsAdapter(val onMainClick: () -> Unit) : RecyclerView.Adapter<ChatsAdapter.MyviewHolder>() {
    val limite = 15
    class MyviewHolder(private val item : View) : RecyclerView.ViewHolder(item) {
        fun bind(onMainClick: ()-> Unit){
            item.rootView.setOnClickListener {
                onMainClick()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chats_cutome,parent,false)

        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        holder.bind(onMainClick)
    }

    override fun getItemCount(): Int {
        return limite
    }
}