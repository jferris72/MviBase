package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseViewState
import com.mvibase.mvibase.common.Result


data class MainViewState(
    val eventResult: Result = Result.Unknown()
) : BaseViewState