package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseViewState
import com.mvibase.mvibase.data.GithubUser


data class MainViewState(
    val data: List<GithubUser> = listOf(),
    val loading: Boolean = false,
    val error: Throwable? = null
) : BaseViewState