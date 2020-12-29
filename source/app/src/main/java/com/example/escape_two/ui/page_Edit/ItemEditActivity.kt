package com.example.escape_two.ui.page_Edit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.escape_two.R

class ItemEditActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itemedit)
    }

    companion object {
        const val EXTRA_MEMO_ID = "EXTRA_MEMO_ID"
        const val EXTRA_MEMO_NAME = "EXTRA_MEMO_NAME"
        const val EXTRA_MEMO_TIME = "EXTRA_MEMO_TIME"
        const val EXTRA_MEMO_CTNT = "EXTRA_MEMO_CTNT"
        const val EXTRA_MEMO_PHOTO = "EXTRA_MEMO_PHOTO"
        const val EXTRA_MODE = "EXTRA_MODE"
    }
}