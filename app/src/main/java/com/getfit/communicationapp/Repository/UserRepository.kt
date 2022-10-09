package com.getfit.communicationapp.Repository

import com.getfit.communicationapp.API.ApiClient
import com.getfit.communicationapp.API.ApiInterface
import com.getfit.communicationapp.models.LoginRequest
import com.getfit.communicationapp.models.LoginResponse
import com.getfit.communicationapp.models.RegisterRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Response

class UserRepository {
val apiClient = ApiClient.buildApiClient(ApiInterface::class.java)

  suspend fun loginUser(loginRequest: LoginRequest): Call<LoginResponse>
        = withContext(Dispatchers.IO){
    val response = apiClient.loginUser(loginRequest)
    return@withContext response
}
 suspend fun makeUserRequest(registerRequest: RegisterRequest)
        = withContext(Dispatchers.IO){
    val response=apiClient.registerUser(registerRequest)
    return@withContext response
}
}