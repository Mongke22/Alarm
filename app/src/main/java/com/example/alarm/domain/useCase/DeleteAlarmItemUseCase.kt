package com.example.alarm.domain.useCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class DeleteAlarmItemUseCase(private val alarmListRepository: AlarmListRepository) {

    suspend fun deleteAlarmItem(alarmItem: AlarmItem) {
        alarmListRepository.deleteAlarmItem(alarmItem)
    }
}
