package com.example.alarm.domain.useCase

import androidx.lifecycle.LiveData
import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class GetAlarmListUseCase(private val alarmListRepository: AlarmListRepository) {

    fun getAlarmList(): LiveData<List<AlarmItem>> {
        return alarmListRepository.getAlarmList()
    }
}
