package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseViewState
import com.mvibase.mvibase.common.Response


data class MainViewState(
    val eventResponse: Response = Response.Unknown()
) : BaseViewState