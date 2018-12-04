package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseViewModel
import com.mvibase.mvibase.common.Dispatcher
import com.mvibase.mvibase.common.Response
import com.mvibase.mvibase.data.GithubRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext


class MainViewModel(private val repo: GithubRepo, private val dispatcher: Dispatcher)
    : BaseViewModel<MainAction, MainViewState>(), CoroutineScope {

    override var viewState: MainViewState = MainViewState()
    override val coroutineContext: CoroutineContext
        get() = dispatcher.background

    override fun load() {
        getUser()
    }

    fun loginClicked() {
        action(MainAction.GoToLogin)
    }

    private fun getUser() = launch {
        launch(dispatcher.foreground) { render { copy(loading = true) } }

        val users = repo.getUsers("jferris").await().body()?.items ?: listOf()

        launch(dispatcher.foreground) { render { copy(data = users, loading = false) } }
    }

}