package com.example.apisample.core.utils

import retrofit2.Response

suspend fun <RequestType> safeCall(apiCall: suspend () -> Response<RequestType>): Result<RequestType> {
    return try {
        Result.create(apiCall())
    } catch (t: Throwable) {
        Result.create(t)
    }
}