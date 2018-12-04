package com.mvibase.mvibase.data

import kotlinx.coroutines.Deferred
import retrofit2.Response


interface GithubDataSource {

    suspend fun getUsers(query: String): Deferred<Response<GithubResponse>>

}