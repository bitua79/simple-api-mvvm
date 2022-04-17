package com.example.apisample.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.apisample.databinding.FragmentAnimeListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeListFragment : Fragment() {

    private lateinit var binding: FragmentAnimeListBinding
    private val viewModel: AnimeListViewModel by viewModels()
    private lateinit var listAdapter: AnimeListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAnimeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        setupRecyclerview()
        getData()
    }

    private fun setupAdapter() {
        listAdapter = AnimeListAdapter()
    }

    private fun setupRecyclerview() {
        with(binding.rvAnimeList) {
            setHasFixedSize(true)
            adapter = listAdapter
        }
    }

    private fun getData() {
        viewModel.animeListResource.observe(viewLifecycleOwner) { resource ->
            val data = resource.handle(
                tag = "ANIME_LIST",
                context = requireContext(),
                errMsg = "failed to load anime"
            )
            listAdapter.submitList(data.orEmpty())
            Log.i("tafaaat", data.toString())
        }
        viewModel.refresh()
        viewModel.refresh()
    }
}