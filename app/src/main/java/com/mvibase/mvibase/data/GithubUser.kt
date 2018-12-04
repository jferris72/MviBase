package com.mvibase.mvibase.data

import com.google.gson.annotations.SerializedName


data class GithubUser(
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Long,
    @SerializedName("url") val url: String
)