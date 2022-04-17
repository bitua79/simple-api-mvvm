package com.example.apisample.data.entity

import com.google.gson.annotations.SerializedName

class AnimeEntity(
    @SerializedName("anime_id")
    val id: String,

    @SerializedName("anime_img")
    val image: String,

    @SerializedName("anime_name")
    val name: String
)