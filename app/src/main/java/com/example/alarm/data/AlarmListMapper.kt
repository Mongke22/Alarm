package com.example.alarm.data

import com.example.alarm.domain.AlarmItem

class AlarmListMapper {
    fun mapEntityToDbModel(alarmItem: AlarmItem) = AlarmItemDbModel(
        id = alarmItem.id,
        name = alarmItem.name,
        time = alarmItem.time,
        enabled = alarmItem.enabled
    )

    fun mapDbModelToEntity(alarmItemDbModel: AlarmItemDbModel) = AlarmItem(
        id = alarmItemDbModel.id,
        name = alarmItemDbModel.name,
        time = alarmItemDbModel.time,
        enabled = alarmItemDbModel.enabled
    )

    fun mapListDbModelToListEntity(list: List<AlarmItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}