package com.appkucing.app.data.repository

import com.appkucing.app.data.model.ActionState
import com.appkucing.app.data.model.News
import com.appkucing.app.data.remote.NewsService
import com.appkucing.app.data.remote.RetrofitApi
import retrofit2.await

class NewsRepository {
    private val newsService: NewsService by lazy { RetrofitApi.newsService() }

    suspend fun listNews() : ActionState<List<News>>{
        return try {
            val list = newsService.listSurat().await()
            ActionState(list.data)
        }catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }
}