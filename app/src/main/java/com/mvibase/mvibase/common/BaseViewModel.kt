package com.mvibase.mvibase.common

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel


abstract class BaseViewModel<A: BaseAction, VS: BaseViewState> : ViewModel() {

    fun state(): LiveData<VS> = renderLiveData
    fun action(): LiveData<A> = actionLiveData

    abstract var viewState: VS

    private val renderLiveData: MutableLiveData<VS> by lazy { MutableLiveData<VS>() }
    private val actionLiveData: MutableLiveData<A> by lazy { MutableLiveData<A>() }

    abstract fun load()

    fun render(vs: VS.() -> VS) {
        viewState = vs.invoke(viewState)
        renderLiveData.value = viewState
    }

    fun action(a: A) {
        actionLiveData.value = a
    }

}