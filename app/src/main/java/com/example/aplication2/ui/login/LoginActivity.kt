package com.example.aplication2.ui.login


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.aplication2.R
import com.example.aplication2.databinding.ActivityLoginBinding
import com.example.aplication2.ui.register.RegisterActivity
import com.example.utils.utils


val util= utils()

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginViewModel= ViewModelProvider(this)[LoginViewModel::class.java]

        loginViewModel.unableFormatDone.observe(this){ state ->
            if(state)binding.correoTextlayout.error = getString(R.string.error_email)
            else  binding.correoTextlayout.error= null
        }

        loginViewModel.unablePasswordDone.observe(this){state ->
            if (state)binding.contraTextlayout.error = getString(R.string.Error_message)
            else binding.contraTextlayout.error= null
        }

        with(binding){
            iniciosesButton.setOnClickListener {
                val email= binding.correoEditText.text.toString()
                val password= binding.contraEditText.text.toString()

                loginViewModel.checkFormat(email)
                loginViewModel.checkPassword(password)
            }

            RegisterTextview.setOnClickListener{
                var intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }


        }

    }


}