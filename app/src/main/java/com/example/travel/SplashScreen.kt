package com.example.travel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    private lateinit var appPrefs:AppPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },6000)

        appPrefs = AppPreferences(this)

        if (appPrefs.isLoggedIn) {
            // User is logged in, navigate to home screen
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            // User is not logged in, show login screen
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}

class AppPreferences(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)

    var isLoggedIn: Boolean
        get() = sharedPreferences.getBoolean("isLoggedIn", false)
        set(value) = sharedPreferences.edit().putBoolean("isLoggedIn", value).apply()
}

