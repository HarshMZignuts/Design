package com.example.onlydesigntask.fragment.appoinmentcal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onlydesigntask.R
import com.example.onlydesigntask.data.CardAppintmentData
import com.example.onlydesigntask.databinding.AppoinmentCalCardCustomeBinding

class CardAppoinmentAdapetr(private val mList : ArrayList<CardAppintmentData>) : RecyclerView.Adapter<CardAppoinmentAdapetr.MyViewHolder>() {

    class MyViewHolder(var binding : AppoinmentCalCardCustomeBinding) : ViewHolder(binding.root){

        fun bind(card : CardAppintmentData){
            binding.iamgeCardViewAppoinmet.setImageResource(card.image)
            binding.txtName.text = card.name
            binding.txtLocationApointmentCard.text = card.location
            binding.textView38.text= card.time
            binding.startTime.text = card.frometiem
            binding.endTime.text = card.endtime
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CardAppoinmentAdapetr.MyViewHolder {
        val view = AppoinmentCalCardCustomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
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