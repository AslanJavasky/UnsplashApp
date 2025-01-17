package com.example.unsplashattestation.data.api.interceptor

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

class AuthTokenInterceptor(
    private val tokenProvider: AuthTokenProvider
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer ${tokenProvider.getToken()}")
            .build()
        return chain.proceed(request)
    }

}