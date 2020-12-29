package com.example.escape_two.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.escape_two.data.MemoRepository

class MainViewModel(application: Application) : ViewModel() {

    private var repository: MemoRepository = MemoRepository(application)

    fun getAll() = repository.getAll()

    fun delete(mid: Long){
        repository.delete(mid)
    }

}