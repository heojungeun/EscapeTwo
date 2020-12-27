package com.example.escape_two

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        onButtonEvent()
    }

    private fun onButtonEvent(){
        btn_about_back.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_about_git.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/heojungeun"))
            startActivity(intent)
        }
    }
}