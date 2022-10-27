package com.example.aplication2.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.aplication2.R
import com.example.aplication2.ui.login.LoginActivity
import com.example.aplication2.ui.register.RegisterActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)

        val timer= Timer()
        timer.schedule(timerTask {
            goToLoginActivity()
        }, 1000)
    }

    private fun goToLoginActivity() {
        val intent= Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}