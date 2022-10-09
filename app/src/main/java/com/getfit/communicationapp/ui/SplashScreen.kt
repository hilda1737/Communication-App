package com.getfit.communicationapp.ui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    lateinit var sharedPrefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPrefs = getSharedPreferences("COMUUNICATION_PREFS", MODE_PRIVATE)
        var accessToken = sharedPrefs.getString("ACCESS_TOKEN","")

        if (accessToken!!.isBlank()){
            startActivity(Intent(this, LoginActivity::class.java))

    }
      else {
            startActivity(Intent(this, LoginActivity::class.java))     }
        finish()
        }
}

