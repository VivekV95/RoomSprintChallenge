package com.vivekvishwanath.roomsprintchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.vivekvishwanath.roomsprintchallenge.favoriteMovieDao
import com.vivekvishwanath.roomsprintchallenge.model.FavoriteMovie
import com.vivekvishwanath.roomsprintchallenge.model.MovieOverview
import com.vivekvishwanath.roomsprintchallenge.repo

class SearchViewModel : ViewModel() {

    fun getMatchingMovies(query: String) =
        repo.getMatchingMovies("b98f8f717026d85eb364fe4ac55cd214", query)

    fun getFavoriteMovies() = favoriteMovieDao.getFavoriteMovies()

    fun insertMovie(movie: FavoriteMovie) = favoriteMovieDao.insertMovie(movie)

    fun updateMovie(movie: FavoriteMovie) = favoriteMovieDao.updateMovie(movie)

    fun deleteMovie(movie: FavoriteMovie) = favoriteMovieDao.deleteMovie(movie)



}