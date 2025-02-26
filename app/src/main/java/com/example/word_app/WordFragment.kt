package com.example.word_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.word_app.databinding.FragmentHomeBinding


class WordFragment : Fragment() {

    private lateinit var  binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_word, container, false)
        binding = FragmentHomeBinding.inflate(inflater,container,false
        )
        val letter = requireArguments().getString("letter")

        binding.wordRCV.adapter = WordAdapter(requireContext(), letter!!)

        return binding.root

    }


}