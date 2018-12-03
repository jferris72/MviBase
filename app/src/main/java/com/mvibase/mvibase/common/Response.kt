package com.mvibase.mvibase.common


sealed class Response {

    class Loading(loading: Boolean) : Response()
    class Success<T>(data: T) : Response()
    class Error(error: Throwable) : Response()
    class Unknown()  : Response()

}