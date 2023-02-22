package com.example.onlydesigntask.fragment.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlydesigntask.R

class RecentBookingAdpter : RecyclerView.Adapter<RecentBookingAdpter.MyViewHolder>() {
    val limte = 5

    class MyViewHolder(item : View) : RecyclerView.ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recent_booking_custome,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return
    }

    override fun getItemCount(): Int {
        return limte
    }
}