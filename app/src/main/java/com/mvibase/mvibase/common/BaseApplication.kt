package com.mvibase.mvibase.common

import android.app.Application
import com.mvibase.mvibase.di.appModule
import org.koin.android.ext.android.startKoin


class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
    }

}