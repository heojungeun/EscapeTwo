package com.example.escape_two.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.escape_two.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecycler()
        onButtonEvent()
    }

    private fun setRecycler(){

    }

    private fun onButtonEvent(){
        btn_1_add.setOnClickListener {

        }

        btn_1_delete.setOnClickListener {

        }

        btn_1_setting.setOnClickListener {

        }
    }
}
