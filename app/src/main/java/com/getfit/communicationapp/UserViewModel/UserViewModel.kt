package com.getfit.communicationapp.UserViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.getfit.communicationapp.Repository.UserRepository
import com.getfit.communicationapp.models.LoginRequest
import com.getfit.communicationapp.models.LoginResponse
import com.getfit.communicationapp.models.RegisterRequest
import com.getfit.communicationapp.models.RegisterResponse

import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    val userRepository = UserRepository()
    private val loginResponseLivedata = MutableLiveData<LoginResponse>()
    val errorLiveData = MutableLiveData<String>()
    var registerResponseLiveData = MutableLiveData<RegisterResponse>()
    val registerErrorLiveData = MutableLiveData<String?>()


    fun loginUser(loginRequest: LoginRequest) {
        viewModelScope.launch {
             userRepository.loginUser(loginRequest)
//            if (response.isSuccessful) {
//                loginResponseLivedata.postValue(response.body())
//
//            } else {
//                errorLiveData.postValue(response.errorBody()?.string())
//            }
        }
    }

    fun registerUser(registerRequest: RegisterRequest) {
        viewModelScope.launch {
            userRepository.makeUserRequest(registerRequest)
//            if (response.is) {
//                registerResponseLiveData.postValue(response.body())
//            } else {
//                val error = response.errrbody()?.string()
//                registerErrorLiveData.postValue(error)
//            }
        }
    }
}
