package com.example.alarm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarm_items")
data class AlarmItemDbModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val name: String,
    val time: Long,
    val enabled: Boolean
)
