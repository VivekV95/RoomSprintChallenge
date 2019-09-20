package com.vivekvishwanath.roomsprintchallenge

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDBApiInterface {
    @GET("search/movie")
    fun getMatchingMovies(@Query("api_key")apiKey: String,
                          @Query("query")query: String): Call<MovieDBResponse>
}