package com.example.apisample.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.example.apisample.core.BaseViewModel
import com.example.apisample.core.entity.Resource
import com.example.apisample.data.entity.AnimeEntity
import com.example.apisample.domain.GetAllAnime
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class AnimeListViewModel @Inject constructor(
    getAllAnime: GetAllAnime
) : BaseViewModel() {

    val animeListResource: LiveData<Resource<List<AnimeEntity>>> = refreshing.switchMap {
        liveData(Dispatchers.IO) {
            emitSource(getAllAnime())
        }
    }}