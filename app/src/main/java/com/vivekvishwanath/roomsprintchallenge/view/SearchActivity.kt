package com.vivekvishwanath.roomsprintchallenge.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.vivekvishwanath.roomsprintchallenge.R
import com.vivekvishwanath.roomsprintchallenge.model.MovieOverview
import com.vivekvishwanath.roomsprintchallenge.viewmodel.SearchViewModel

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchViewModel = ViewModelProviders .of(this).get(SearchViewModel::class.java)

        searchViewModel.getMatchingMovies("batman").observe(this, Observer<MutableList<MovieOverview>> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        })

    }
}
