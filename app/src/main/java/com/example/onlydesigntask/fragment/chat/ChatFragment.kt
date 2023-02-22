package com.example.onlydesigntask.fragment.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onlydesigntask.R
import com.example.onlydesigntask.databinding.FragmentChatBinding
import com.example.onlydesigntask.databinding.FragmentChatsBinding


class ChatFragment : Fragment() {
    private var _binding: FragmentChatBinding? = null

    private val binding: FragmentChatBinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        binding.shapeableImageView12.setOnClickListener {
            findNavController().navigateUp()
        }
        return binding.root



    }

}