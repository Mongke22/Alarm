package com.example.alarm.domain

data class AlarmItem(
    val name: String,
    val time: Long,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID
) {

    companion object {

        const val UNDEFINED_ID = 0
    }
}
