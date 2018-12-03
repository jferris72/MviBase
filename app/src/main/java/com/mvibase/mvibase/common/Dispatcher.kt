package com.mvibase.mvibase.common

import kotlinx.coroutines.Dispatchers


object Dispatcher {
    val background = Dispatchers.IO
    val foreground = Dispatchers.Main
}