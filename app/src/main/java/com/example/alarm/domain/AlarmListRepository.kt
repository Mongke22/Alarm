package com.example.alarm.domain

import androidx.lifecycle.LiveData

interface AlarmListRepository {

    suspend fun addAlarmItem(shopItem: AlarmItem)

    suspend fun deleteAlarmItem(shopItem: AlarmItem)

    suspend fun editAlarmItem(shopItem: AlarmItem)

    suspend fun getAlarmItem(shopItemId: Int): AlarmItem

    fun getAlarmList(): LiveData<List<AlarmItem>>
}
