package com.mvibase.mvibase.di

import com.mvibase.mvibase.main.MainDataSource
import com.mvibase.mvibase.main.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module


val appModule = module {

    viewModel { MainViewModel(get()) }

    single { MainDataSource() }

}