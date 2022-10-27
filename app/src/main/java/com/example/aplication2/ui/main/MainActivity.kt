package com.example.aplication2.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplication2.R
import com.example.aplication2.databinding.ActivityMainBinding

private lateinit var mainBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)





    }
}