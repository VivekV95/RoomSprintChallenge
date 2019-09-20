package com.vivekvishwanath.roomsprintchallenge

import androidx.room.Entity

class MovieDBResponse(val results: MutableList<MovieOverview>)

@Entity
class MovieOverview {
    var vote_average: Double = 0.toDouble()
        private set
    var backdrop_path: String? = null
        private set
    var isAdult: Boolean = false
        private set
    var id: Int = 0
        private set
    var title: String? = null
        private set
    var overview: String? = null
        private set
    var original_language: String? = null
        private set
    var release_date: String? = null
        private set
    var original_title: String? = null
        private set
    var vote_count: Int = 0
        private set
    var poster_path: String? = null
        private set
    var isVideo: Boolean = false
        private set
    var popularity: Double = 0.toDouble()
        private set
}