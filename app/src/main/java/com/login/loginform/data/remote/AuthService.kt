package com.login.loginform.data.remote

import com.login.loginform.data.model.LoginRequest
import com.login.loginform.data.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/login")
    suspend fun login(@Body request: LoginRequest) : LoginResponse
}