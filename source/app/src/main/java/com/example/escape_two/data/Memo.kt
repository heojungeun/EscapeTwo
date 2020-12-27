package com.example.escape_two.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="memo")
data class Memo (
    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    @ColumnInfo(name = "mtime")
    var time: String,

    @ColumnInfo(name = "mcontent")
    var content: String,

    @ColumnInfo(name = "mphoto")
    var photo: String = ""
)