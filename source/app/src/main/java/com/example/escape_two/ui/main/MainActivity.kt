package com.example.escape_two.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.escape_two.R
import com.example.escape_two.data.Memo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainRecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecycler()
        onButtonEvent()
    }

    private fun setRecycler(){
        adapter = MainRecyclerAdapter({ item ->

        },{ item ->
            deleteItem(item)
        })
    }

    private fun deleteItem(item: Memo){

    }

    private fun onButtonEvent(){
        btn_1_add.setOnClickListener {

        }

        btn_1_setting.setOnClickListener {

        }
    }
}
