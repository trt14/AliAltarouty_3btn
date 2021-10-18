package com.example.a3buttonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a3buttonapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            toastInput()

        }

        binding.btn2.setOnClickListener {
            tvInput()
        }

        binding.btn3.setOnClickListener {
            val input1 = binding.etText1.text.toString()
            val input2 = binding.etText2.text.toString()
            val input3 = binding.etText3.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("input1", input1)
            intent.putExtra("input2", input2)
            intent.putExtra("input3", input3)
            startActivity(intent)

        }
    }

    private fun toastInput(){
        val input1 = binding.etText1.text.toString()
        val input2 = binding.etText2.text.toString()
        val input3 = binding.etText3.text.toString()


        Toast.makeText(this, input1.toString(), Toast.LENGTH_LONG).show()
        Toast.makeText(this, input2.toString(), Toast.LENGTH_LONG).show()
        Toast.makeText(this, input3.toString(), Toast.LENGTH_LONG).show()


    }

    private fun tvInput(){
        val input1 = binding.etText1.text.toString()
        val input2 = binding.etText2.text.toString()
        val input3 = binding.etText3.text.toString()

        binding.tvText.append("$input1 ")
        binding.tvText.append("$input2 ")
        binding.tvText.append("$input3 ")
    }
}
