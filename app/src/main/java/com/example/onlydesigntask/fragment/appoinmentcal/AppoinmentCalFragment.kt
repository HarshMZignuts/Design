package com.example.onlydesigntask.fragment.appoinmentcal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlydesigntask.R
import com.example.onlydesigntask.data.CardAppintmentData
import com.example.onlydesigntask.data.DateData
import com.example.onlydesigntask.databinding.FragmentAppoinmentCalBinding


class AppoinmentCalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding : FragmentAppoinmentCalBinding? =null
    private val binging : FragmentAppoinmentCalBinding
        get() = _binding!!
lateinit var adapter : DateAdapter
    lateinit var adapterappointment : CardAppoinmentAdapetr

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAppoinmentCalBinding.inflate(inflater,container,false)

        daterecycle()
        cardrecycler()
        return binging.root
    }
    fun daterecycle(){
        val date  = ArrayList<DateData>()
        date.add(DateData("Mon","5"))
        date.add(DateData("Tue","6"))
        date.add(DateData("Wed","7"))
        date.add(DateData("Thus","8"))
        date.add(DateData("Fri","9"))
        date.add(DateData("Sat","10"))

        adapter = DateAdapter(date)
        binging.recylcerDate.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binging.recylcerDate.adapter = adapter
    }
    fun cardrecycler(){
        val data = ArrayList<CardAppintmentData>()
        data.add(CardAppintmentData(R.drawable.women,"Curtis Stone","8002 Zurich","75min","7:00 AM","8:00 AM"))
        data.add(CardAppintmentData(R.drawable.woman2,"Maria","8002 Zurich","60min","8:00 AM","9:00 AM"))
        data.add(CardAppintmentData(R.drawable.women,"Curtis Stone","8002 Zurich","85min","9:30 AM","11:00 AM"))
        data.add(CardAppintmentData(R.drawable.woman2,"Maria","8002 Zurich","55min","11:00 AM","11:30 AM"))
        adapterappointment = CardAppoinmentAdapetr(data)
        binging.recylerCardAppoinment.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binging.recylerCardAppoinment.adapter = adapterappointment
    }

}