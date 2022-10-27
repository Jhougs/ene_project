package com.example.aplication2.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplication2.R
import com.example.aplication2.databinding.ActivityLoginBinding
import com.example.aplication2.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerbinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        registerbinding= ActivityRegisterBinding.inflate(layoutInflater)
        val view= registerbinding.root
        setContentView(view)





    }
}