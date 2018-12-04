package com.mvibase.mvibase.data

import com.google.gson.annotations.SerializedName


data class GithubResponse(
    @SerializedName("items") val items: List<GithubUser>
)