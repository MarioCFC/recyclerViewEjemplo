package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.R
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}