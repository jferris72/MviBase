package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseViewModel
import com.mvibase.mvibase.common.Dispatcher
import com.mvibase.mvibase.common.Response
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext


class MainViewModel(private val repo: MainDataSource, private val dispatcher: Dispatcher)
    : BaseViewModel<MainAction, MainViewState>(), CoroutineScope {

    override var viewState: MainViewState = MainViewState()
    override val coroutineContext: CoroutineContext
        get() = dispatcher.background

    override fun load() {
        getUser()
    }

    fun loginClicked() {
        sendAction(MainAction.GoToLogin)
    }

    private fun getUser() = launch {
        render { copy(eventResponse = Response.Loading(true)) }

        //Do get user
        render { copy(eventResponse = Response.Success("User")) }
    }

}