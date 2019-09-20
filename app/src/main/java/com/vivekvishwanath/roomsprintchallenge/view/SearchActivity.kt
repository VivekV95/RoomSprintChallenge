package com.vivekvishwanath.roomsprintchallenge.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.vivekvishwanath.roomsprintchallenge.R
import com.vivekvishwanath.roomsprintchallenge.adapter.MovieListAdapter
import com.vivekvishwanath.roomsprintchallenge.model.MovieOverview
import com.vivekvishwanath.roomsprintchallenge.viewmodel.SearchViewModel
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity() {

    private var movies = mutableListOf<MovieOverview>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchViewModel = ViewModelProviders .of(this).get(SearchViewModel::class.java)

        val movieListAdapter = MovieListAdapter(movies)

        search_recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@SearchActivity)
            adapter = movieListAdapter
        }

        search_view.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String?): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                searchViewModel
                    .getMatchingMovies(p0!!)
                    .observe(this@SearchActivity, Observer<MutableList<MovieOverview>> {
                        movies.clear()
                        movies.addAll(it)
                        movieListAdapter.notifyDataSetChanged()
                    })
                return false
            }

        })
    }
}
