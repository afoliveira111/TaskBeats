package com.comunidadedevspace.taskbeats.data.remote


import com.comunidadedevspace.taskbeats.BuildConfig
import retrofit2.http.GET

interface NewsService {

    //https://api.thenewsapi.com/v1/news/top?api_token=&locale=us&limit=5 api_token=4DKKwK92bQUT2lnrULvfuzy2jwC8rZGvYwOk18hA
    @GET("top?api_token=${BuildConfig.API_KEY}&locale=us")
    suspend fun fetchTopNews(): NewsResponse

    @GET("all?api_token=${BuildConfig.API_KEY}&locale=us")
    suspend fun fetchAllNews(): NewsResponse

}