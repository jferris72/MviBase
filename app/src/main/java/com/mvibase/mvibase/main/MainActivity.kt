package com.mvibase.mvibase.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.mvibase.mvibase.R
import com.mvibase.mvibase.common.BaseView
import com.mvibase.mvibase.common.Response
import com.mvibase.mvibase.data.GithubUser
import com.mvibase.mvibase.main.MainAction.GoToLogin
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseView<MainAction, MainViewState, MainViewModel>() {

    override val viewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

    }

    override fun onRender(viewState: MainViewState) {
        when {
            viewState.error != null -> { /* show error */ }
            viewState.loading -> { /* show loading */ }
            else -> {
                usersRv.adapter = UserAdapter(viewState.data)
                usersRv.layoutManager = LinearLayoutManager(this)
            }
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
