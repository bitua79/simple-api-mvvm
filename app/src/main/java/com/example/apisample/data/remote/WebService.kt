package com.example.apisample.data.remote

import com.example.apisample.core.entity.APIResponse
import com.example.apisample.data.entity.AnimeEntity
import retrofit2.Response
import retrofit2.http.GET

interface WebService {

    @GET("v1")
    suspend fun getAllCryptocurrencies(): Response<APIResponse<List<AnimeEntity>>>

}