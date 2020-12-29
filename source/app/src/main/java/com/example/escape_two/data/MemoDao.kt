package com.example.escape_two.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MemoDao {

    @Query("select * from memo")
    fun getAll(): LiveData<List<Memo>>

    @Query("select * from memo where id= :id")
    fun get(id: Long): LiveData<Memo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(memo : Memo)

    @Query("delete from memo where id= :id")
    fun delete(id : Long)

    @Query("delete from memo")
    fun deleteAll()
}