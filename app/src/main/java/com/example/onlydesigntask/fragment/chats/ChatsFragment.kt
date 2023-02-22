package com.example.onlydesigntask.fragment.chats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlydesigntask.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    private var _binding: FragmentChatsBinding? = null

    private val binding: FragmentChatsBinding
        get() = _binding!!

    private lateinit var adapter: ChatsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        adapter = ChatsAdapter {
            findNavController().navigate(ChatsFragmentDirections.actionChatsFragmentToChatFragment())
        }
        binding.recyclerChats.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerChats.adapter = adapter
        return binding.root
    }

}