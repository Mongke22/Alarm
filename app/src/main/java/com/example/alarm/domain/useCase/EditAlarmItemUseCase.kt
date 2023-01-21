package com.example.alarm.domain.useCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class EditAlarmItemUseCase(private val alarmListRepository: AlarmListRepository) {

    suspend fun editAlarmItem(alarmItem: AlarmItem) {
        alarmListRepository.editAlarmItem(alarmItem)
    }
}
