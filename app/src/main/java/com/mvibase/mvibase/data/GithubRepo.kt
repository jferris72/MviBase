package com.mvibase.mvibase.data

import kotlinx.coroutines.Deferred
import retrofit2.Response


class GithubRepo(private val api: GithubApi) : GithubDataSource {

    override suspend fun getUsers(query: String): Deferred<Response<GithubResponse>> {
        return api.getUsers(query)
    }

}