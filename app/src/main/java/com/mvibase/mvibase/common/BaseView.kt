package com.mvibase.mvibase.common


interface BaseView<A: BaseAction, VS: BaseViewState> {

    fun onRender(viewState: VS)
    fun onAction(action: A)

}