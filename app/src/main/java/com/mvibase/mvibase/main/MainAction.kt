package com.mvibase.mvibase.main

import com.mvibase.mvibase.common.BaseAction


sealed class MainAction : BaseAction {

    object GoToLogin : MainAction()
    object GoToSignUp : MainAction()
    object GoToForgotPassword : MainAction()

}