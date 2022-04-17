package com.example.apisample.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.apisample.core.entity.Resource
import com.example.apisample.core.utils.EmptyResult
import com.example.apisample.core.utils.ErrorResult
import com.example.apisample.core.utils.SuccessResult
import com.example.apisample.core.utils.safeCall
import com.example.apisample.data.entity.AnimeEntity
import com.example.apisample.data.remote.WebService
import javax.inject.Inject

class AnimeDefaultRepository @Inject constructor(
    private val service: WebService
) : AnimeRepository {
    override suspend fun getAllAnime(): LiveData<Resource<List<AnimeEntity>>> {

        when (val response = safeCall { service.getAllCryptocurrencies() }) {
            is SuccessResult -> {
                return liveData {
                    emit(Resource.Success(response.body.data.orEmpty()))
                }
            }
            is ErrorResult -> {

                return liveData {
                    emit(Resource.Error(response.errorMessage, emptyList()))
                }
            }
            is EmptyResult -> {
                return liveData {
                    emit(Resource.Success(emptyList()))
                }
            }
        }
    }
}