package com.example.escape_two.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.escape_two.R
import com.example.escape_two.data.Memo
import com.example.escape_two.ui.page_Edit.ItemEditActivity
import com.example.escape_two.ui.page_View1.ItemViewActivity
import com.example.escape_two.ui.setting.SettingActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainRecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private val mvModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecycler()
        setVM()
        onButtonEvent()
    }

    private fun setRecycler(){
        adapter = MainRecyclerAdapter({ item ->
            var intent = Intent(this, ItemViewActivity::class.java)
            intent.putExtra(ItemViewActivity.EXTRA_MEMO_ID, item.id)
            startActivity(intent)
        },{ item ->
            deleteItem(item)
        })

        linearLayoutManager = LinearLayoutManager(this)
    }

    private fun setVM(){

    }

    private fun deleteItem(item: Memo){
        var builder = AlertDialog.Builder(this)
        builder.setMessage("정말 삭제하시겠습니까?")
            .setNegativeButton("취소"){_, _->}
            .setPositiveButton("삭제"){_, _->
                mvModel.delete(item.id!!)
            }
        builder.show()
    }

    private fun onButtonEvent(){
        btn_1_add.setOnClickListener {
            var intent = Intent(this, ItemViewActivity::class.java)
            intent.putExtra(ItemEditActivity.EXTRA_MODE, 1)
            startActivity(intent)
        }

        btn_1_setting.setOnClickListener {
            var intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
    }
}
