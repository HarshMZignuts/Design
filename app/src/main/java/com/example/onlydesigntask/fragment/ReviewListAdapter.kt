package com.example.onlydesigntask.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onlydesigntask.R

class ReviewListAdapter : RecyclerView.Adapter<ReviewListAdapter.MyViewHolder>() {
    val limte = 5

    class MyViewHolder(item : View) : ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recent_review_coustome,parent,false)
        return ReviewListAdapter.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return
    }

    override fun getItemCount(): Int {
        return limte
    }
}