package com.example.a3buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3buttonapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val input1 = intent.getStringExtra("input1")
        val input2 = intent.getStringExtra("input2")
        val input3 = intent.getStringExtra("input3")

        binding.tv.append("$input1 \n")
        binding.tv.append("$input2 \n")
        binding.tv.append("$input3 \n")
    }
}
