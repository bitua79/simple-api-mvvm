package com.example.apisample.data.repository

import androidx.lifecycle.LiveData
import com.example.apisample.core.entity.Resource
import com.example.apisample.data.entity.AnimeEntity

interface AnimeRepository {

    suspend fun getAllAnime(): LiveData<Resource<List<AnimeEntity>>>
}