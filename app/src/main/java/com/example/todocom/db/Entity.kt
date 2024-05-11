package com.example.todocom.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "To_Do")
class Entity (

    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var priority: String,
    var description: String

)