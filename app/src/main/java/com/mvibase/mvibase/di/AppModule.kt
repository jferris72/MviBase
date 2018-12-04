package com.mvibase.mvibase.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.mvibase.mvibase.common.Dispatcher
import com.mvibase.mvibase.data.GithubApi
import com.mvibase.mvibase.data.GithubRepo
import com.mvibase.mvibase.main.MainDataSource
import com.mvibase.mvibase.main.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {

    viewModel { MainViewModel(get(), get()) }

    single { MainDataSource() }

    single { GithubRepo(get()) }

    single { Dispatcher }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build().create(GithubApi::class.java)
    }

}