package com.mvibase.mvibase.common


sealed class Result {

    class Loading(loading: Boolean) : Result()
    class Success<T>(data: T) : Result()
    class Error(error: Throwable) : Result()
    class Unknown()  : Result()

}