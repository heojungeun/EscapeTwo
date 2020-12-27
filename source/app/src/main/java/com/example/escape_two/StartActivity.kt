package com.example.escape_two

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        onButtonEvent()
    }

    private fun onButtonEvent(){

        btn_0_open.setOnClickListener {
            // go main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_0_about.setOnClickListener {
            // go about activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}