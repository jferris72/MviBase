package com.mvibase.mvibase.main

import android.os.Bundle
import com.mvibase.mvibase.R
import com.mvibase.mvibase.common.BaseView
import com.mvibase.mvibase.common.Response
import com.mvibase.mvibase.main.MainAction.GoToLogin
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseView<MainAction, MainViewState, MainViewModel>() {

    override val viewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        helloWorld.setOnClickListener { viewModel.loginClicked() }
    }

    override fun onRender(viewState: MainViewState) {
        val response = viewState.eventResponse

        when(response) {
            is Response.Loading -> { /* show loading */ }
            is Response.Error -> { /* show error */ }
            is Response.Success<*> -> { /* show view */ }
        }
    }

    override fun onAction(action: MainAction) {
        when(action) {
            is GoToLogin -> goToLogin()
        }
    }

    private fun goToLogin() {
        //Intent
    }
}
