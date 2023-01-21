package com.example.alarm.domain.useCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class GetAlarmItemUseCase(private val alarmListRepository: AlarmListRepository) {

    suspend fun getAlarmItem(alarmItemId: Int): AlarmItem {
        return alarmListRepository.getAlarmItem(alarmItemId)
    }
}
