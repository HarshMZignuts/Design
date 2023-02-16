package com.example.onlydesigntask.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlydesigntask.R

class ApoinmentListAdpter :  RecyclerView.Adapter<ApoinmentListAdpter.MyViewHolder>() {

    val limit =5
    class MyViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.appoiment_custome,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return
    }

    override fun getItemCount(): Int {
        return limit
    }
}