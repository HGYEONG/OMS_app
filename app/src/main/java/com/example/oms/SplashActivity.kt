package com.example.oms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Landing Page
 * Move to LoginActivity after loading resources done
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Todo: Login Check

        // Show Splash View and Move to Login Activity
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

        finish()

    }
}