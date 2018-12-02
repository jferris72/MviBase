package com.mvibase.mvibase.common

import android.arch.lifecycle.LiveData


interface BaseViewModel<A: BaseAction, VS: BaseViewState> {

    fun state(): LiveData<VS>
    fun action(): LiveData<A>

}