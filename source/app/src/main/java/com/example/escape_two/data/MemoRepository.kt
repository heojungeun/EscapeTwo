package com.example.escape_two.data

import android.app.Application
import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class MemoRepository(application: Application): CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private val memoDatabase = MemoDatabase.getInstance(application)!!
    private val memoDao: MemoDao = memoDatabase.memoDao()
    private val allmemo: LiveData<List<Memo>> = memoDao.getAll()

    fun getAll(): LiveData<List<Memo>>{
        return allmemo
    }

    fun get(id: Long): LiveData<Memo>{
        return memoDao.get(id)
    }

    fun insert(memo: Memo){
        launch { insertBG(memo) }
    }

    private suspend fun insertBG(memo: Memo){
        withContext(Dispatchers.IO){
            memoDao?.insert(memo)
        }
    }

    fun delete(id: Long){
        launch { deleteBG(id) }
    }

    private suspend fun deleteBG(id: Long){
        withContext(Dispatchers.IO){
            memoDao?.delete(id)
        }
    }
}