package com.example.oms

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.utils.widget.ImageFilterButton

/**
 * Login Activity
 * Logo Animated
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val view = findViewById<View>(R.id.logo_view)

        // logo Animator
        val anim1 = ObjectAnimator.ofFloat(view, "translationY", 100f)
        anim1.setDuration(2000)
        val anim2 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        anim2.setDuration(2000)

        AnimatorSet().apply {
            playTogether(anim1, anim2)
            start()
        }

        // Kakao Login Button Click Event
        findViewById<ImageFilterButton>(R.id.kakao_login_btn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}