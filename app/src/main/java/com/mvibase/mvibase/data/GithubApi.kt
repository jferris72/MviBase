package com.mvibase.mvibase.data

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface GithubApi {

    @GET("/search/users")
    fun getUsers(
        @Query("q") query: String
    ): Deferred<Response<GithubResponse>>

}