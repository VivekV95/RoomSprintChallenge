package com.vivekvishwanath.roomsprintchallenge.viewmodel

import androidx.lifecycle.ViewModel
import com.vivekvishwanath.roomsprintchallenge.model.FavoriteMovie
import com.vivekvishwanath.roomsprintchallenge.repo

class FavoritesViewModel : ViewModel() {

    fun getFavoriteMovies() = repo.getFavoriteMovies()

    fun insertMovie(movie: FavoriteMovie) = repo.insertMovie(movie)

    fun deleteMovie(movie: FavoriteMovie) = repo.deleteMovie(movie)

    fun updateMovie(movie: FavoriteMovie) = repo.updateMovie(movie)
}