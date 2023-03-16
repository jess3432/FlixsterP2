package com.codepath.articlesearch

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val results: List<Article>?
)

@Keep
@Serializable
data class Article(
    @SerialName("backdrop_path")
    var backdrop_path: String? = null,

    @SerialName("id")
    var movie_id: String? = null,

    @SerialName("name")
    var movie_name: String? = null,

    @SerialName("overview")
    var movie_overview: String? = null,

    @SerialName("poster_path")
    var poster_path: String? = null,

    @SerialName("vote_average")
    var vote_average: Float?
) : java.io.Serializable