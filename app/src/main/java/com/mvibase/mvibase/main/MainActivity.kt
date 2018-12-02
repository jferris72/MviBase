package com.mvibase.mvibase.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mvibase.mvibase.R
import com.mvibase.mvibase.common.BaseView
import com.mvibase.mvibase.main.MainAction.GoToLogin
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(), BaseView<MainAction, MainViewState> {

    val viewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloWorld.setOnClickListener { viewModel.helloWorldClicked() }
    }

    override fun onRender(viewState: MainViewState) {

    }

    override fun onAction(action: MainAction) {
        when(action) {
            is GoToLogin -> goToLogin()
        }
    }

    fun goToLogin() {
        //Intent
    }
}
