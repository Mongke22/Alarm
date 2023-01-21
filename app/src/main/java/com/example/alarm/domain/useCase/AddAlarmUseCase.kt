package com.example.alarm.domain.useCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class AddAlarmUseCase(private val alarmListRepository: AlarmListRepository) {

    suspend fun addAlarmItem(alarmItem: AlarmItem) {
        alarmListRepository.addAlarmItem(alarmItem)
    }
}
