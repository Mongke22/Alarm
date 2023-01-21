package com.example.alarm.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.AlarmListRepository

class AlarmListRepositoryImpl(application: Application
) : AlarmListRepository {

    private val alarmListDao = AppDatabase.getInstance(application).alarmListDao()
    private val mapper = AlarmListMapper()

    override suspend fun addAlarmItem(alarmItem: AlarmItem) {
        alarmListDao.addAlarmItem(mapper.mapEntityToDbModel(alarmItem))
    }

    override suspend fun deleteAlarmItem(alarmItem: AlarmItem) {
        alarmListDao.deleteAlarmItem(alarmItem.id)
    }

    override suspend fun editAlarmItem(alarmItem: AlarmItem) {
        alarmListDao.addAlarmItem(mapper.mapEntityToDbModel(alarmItem))
    }

    override suspend fun getAlarmItem(shopItemId: Int): AlarmItem {
        val dbModel = alarmListDao.getAlarmItem(shopItemId)
        return mapper.mapDbModelToEntity(dbModel)
    }

    override fun getAlarmList(): LiveData<List<AlarmItem>> = Transformations.map(
        alarmListDao.getAlarmList()
    ) {
        mapper.mapListDbModelToListEntity(it)
    }
}