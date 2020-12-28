package com.appkucing.app.data.remote

import com.appkucing.app.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

    @GET("api/provinsi/")
    fun listSurat() : Call< NewsList>
}