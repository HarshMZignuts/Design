package com.example.onlydesigntask.fragment.appoinmentcal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onlydesigntask.R
import com.example.onlydesigntask.data.CardAppintmentData
import com.example.onlydesigntask.data.DateData
import com.example.onlydesigntask.databinding.AppoinmentCalCardCustomeBinding
import com.example.onlydesigntask.databinding.DateCustomeBinding

class DateAdapter(private val mList : ArrayList<DateData>) : RecyclerView.Adapter<DateAdapter.MyViewHolder>() {
    val limit = 7
    class MyViewHolder(var biding : DateCustomeBinding) : ViewHolder(biding.root) {
        fun bind(date : DateData){
            biding.txtDay.text = date.day
            biding.txtDate.text = date.date
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = DateCustomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return mList.size

    }
}