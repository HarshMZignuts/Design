package com.example.onlydesigntask.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlydesigntask.R
import com.example.onlydesigntask.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null

    private val binding: FragmentHomeBinding
        get() = _binding!!

    private lateinit var adapter: ApoinmentListAdpter
    private lateinit var adapterreview : ReviewListAdapter
    private lateinit var adapterbokking : RecentBookingAdpter

//    var months = arrayOf<String>("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sup","Nav","Des")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        adapter = ApoinmentListAdpter()
        binding.recyclerAppoinmrnt.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerAppoinmrnt.adapter = adapter

        adapterreview = ReviewListAdapter()
        binding.recyclwrReview.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.recyclwrReview.adapter = adapterreview

        adapterbokking = RecentBookingAdpter()
        binding.recyclerbookin.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerbookin.adapter = adapterbokking

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.month_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.spinner.adapter = adapter
        }

        return binding.root
    }


}