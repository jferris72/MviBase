package com.mvibase.mvibase.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.mvibase.mvibase.common.BaseViewModel


class MainViewModel(val repo: MainDataSource) : ViewModel(), BaseViewModel<MainAction, MainViewState> {
    val viewState: MainViewState = MainViewState()

    override fun state(): LiveData<MainViewState>  {
        return MutableLiveData<MainViewState>()
    }

    override fun action(): LiveData<MainAction> {
        return MutableLiveData<MainAction>()
    }

    fun helloWorldClicked() {

    }

}