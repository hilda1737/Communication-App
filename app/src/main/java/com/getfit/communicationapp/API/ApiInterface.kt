package com.getfit.communicationapp.API

import com.getfit.communicationapp.models.LoginRequest
import com.getfit.communicationapp.models.LoginResponse
import com.getfit.communicationapp.models.RegisterRequest
import com.getfit.communicationapp.models.RegisterResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

        @POST("/register")
      fun registerUser(@Body registerRequest: RegisterRequest): Response<RegisterResponse>

        @POST("/login")
     fun loginUser(@Body loginRequest: LoginRequest): Call<LoginResponse>

    }
