package com.mvibase.mvibase.common

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


abstract class BaseView<A: BaseAction, VS: BaseViewState, VM: BaseViewModel<A, VS>> : AppCompatActivity() {

    abstract val viewModel: BaseViewModel<A, VS>

    abstract fun onRender(viewState: VS)
    abstract fun onAction(action: A)

    private fun subscribe() {
        viewModel.state().observe(this, Observer<VS> {
            if(it != null) onRender(it)
        })
        viewModel.action().observe(this, Observer<A> {
            if(it != null) onAction(it)
        })
        viewModel.load()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribe()
    }
}