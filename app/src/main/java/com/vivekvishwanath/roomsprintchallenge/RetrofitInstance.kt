package com.vivekvishwanath.roomsprintchallenge

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    val gson = GsonBuilder()
        .setLenient()
        .create()

    val retrofitService = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(MovieDBApiInterface::class.java)

    fun getMatchingMovies(): MutableList<MovieDBResponse> {

    }

}
