package com.example.onlydesigntask.fragment.finance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlydesigntask.databinding.FragmentFinianceBinding


class FinianceFragment : Fragment() {
    private var _binding: FragmentFinianceBinding? = null

    private val binding: FragmentFinianceBinding
        get() = _binding!!

    private lateinit var adapter: FinianceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFinianceBinding.inflate(inflater, container, false)
        adapter = FinianceAdapter()
        binding.finianceRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.finianceRecycler.adapter = adapter
        return binding.root
    }


}