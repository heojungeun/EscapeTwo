package com.example.escape_two

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

        openbtn.setOnClickListener {
            // go main activity
        }

        aboutbtn.setOnClickListener {
            // go about activity
        }
    }
}