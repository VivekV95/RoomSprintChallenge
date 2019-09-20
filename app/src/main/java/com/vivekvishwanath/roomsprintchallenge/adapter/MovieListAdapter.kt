package com.vivekvishwanath.roomsprintchallenge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vivekvishwanath.roomsprintchallenge.R
import com.vivekvishwanath.roomsprintchallenge.model.MovieOverview
import kotlinx.android.synthetic.main.movie_list_item.view.*

class MovieListAdapter(val movies: List<MovieOverview>): RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_list_item, parent, false))
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindMovie(movie: MovieOverview) {
            itemView.movie_title.text = movie.title
            itemView.movie_description.text = movie.overview
        }
    }
}