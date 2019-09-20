package com.vivekvishwanath.roomsprintchallenge

import android.app.Application
import com.vivekvishwanath.roomsprintchallenge.database.FavoriteMovieDao
import com.vivekvishwanath.roomsprintchallenge.database.FavoriteMovieDatabase
import com.vivekvishwanath.roomsprintchallenge.repository.MovieRepository
import com.vivekvishwanath.roomsprintchallenge.retrofit.RetrofitInstance

val repo: MovieInterface by lazy {
    App.repo
}

val retrofitInstance: RetrofitInstance by lazy {
    App.retrofitInstance
}

val favoriteMovieDao: FavoriteMovieDao by lazy {
    App.favoriteMovieDao
}

class App: Application() {
    companion object {
        lateinit var repo: MovieInterface
        lateinit var retrofitInstance: RetrofitInstance
        lateinit var favoriteMovieDao: FavoriteMovieDao
    }

    override fun onCreate() {
        super.onCreate()

        repo = MovieRepository(applicationContext)
        retrofitInstance = RetrofitInstance()
        favoriteMovieDao = FavoriteMovieDatabase.getInstance(applicationContext).getFavoriteMovieDao()
    }
}