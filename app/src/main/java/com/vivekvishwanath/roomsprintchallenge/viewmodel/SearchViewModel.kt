package com.vivekvishwanath.roomsprintchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.vivekvishwanath.roomsprintchallenge.model.MovieOverview
import com.vivekvishwanath.roomsprintchallenge.repo

class SearchViewModel : ViewModel() {
    fun getMatchingMovies(query: String): LiveData<MutableList<MovieOverview>> {
        return repo.getMatchingMovies("b98f8f717026d85eb364fe4ac55cd214", query)
    }
}