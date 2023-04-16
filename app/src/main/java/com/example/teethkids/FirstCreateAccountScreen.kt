package com.example.teethkids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teethkids.databinding.FirstCreateAccountScreenActivityBinding

class FirstCreateAccountScreen : AppCompatActivity() {

    lateinit var binding:FirstCreateAccountScreenActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_create_account_screen_activity)
        binding = FirstCreateAccountScreenActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoBack.setOnClickListener {
            val pass = Intent(this, MainActivity::class.java)
            startActivity(pass)
        }

        binding.btnContinue.setOnClickListener {
            val pass = Intent(this, SecondCreateAccountScreen::class.java)
            startActivity(pass)
        }
    }
}