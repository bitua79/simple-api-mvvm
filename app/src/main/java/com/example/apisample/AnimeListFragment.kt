package com.example.apisample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.apisample.databinding.FragmentAnimeListBinding

class AnimeListFragment: Fragment() {

    private lateinit var binding: FragmentAnimeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAnimeListBinding.inflate(inflater, container, false)
        return binding.root
    }
}