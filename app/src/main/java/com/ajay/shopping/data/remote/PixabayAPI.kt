package com.ajay.shopping.data.remote

import com.ajay.shopping.BuildConfig
import com.ajay.shopping.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {
    @GET("/api/")
    suspend fun searchForImage(@Query("q") searchQuery: String,
                               @Query("key") apiKey: String = BuildConfig.API_KEY
    ):Response<ImageResponse>
}