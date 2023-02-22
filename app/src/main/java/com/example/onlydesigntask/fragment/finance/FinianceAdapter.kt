package com.example.onlydesigntask.fragment.finance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onlydesigntask.R

class FinianceAdapter: RecyclerView.Adapter<FinianceAdapter.MyviewHolder>() {
    val limite = 7
    class MyviewHolder(item : View) : ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.finaince_custome,parent,false)
        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        return
    }

    override fun getItemCount(): Int {
        return limite
    }
}