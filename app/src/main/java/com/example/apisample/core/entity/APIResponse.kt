package com.example.apisample.core.entity

data class APIResponse<T>(
    val success: Boolean? = null,
    val data: T? = null,
)