package com.example.alarm.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.alarm.data.AlarmListRepositoryImpl
import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.useCase.DeleteAlarmItemUseCase
import com.example.alarm.domain.useCase.EditAlarmItemUseCase
import com.example.alarm.domain.useCase.GetAlarmListUseCase
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val repository = AlarmListRepositoryImpl(application)

    private val getShopListUseCase = GetAlarmListUseCase(repository)
    private val deleteAlarmItemUseCase = DeleteAlarmItemUseCase(repository)
    private val editAlarmItemUseCase = EditAlarmItemUseCase(repository)

    val shopList = getShopListUseCase.getAlarmList()

    fun deleteShopItem(alarmItem: AlarmItem) {
        viewModelScope.launch {
            deleteAlarmItemUseCase.deleteAlarmItem(alarmItem)
        }
    }

    fun changeEnableState(alarmItem: AlarmItem) {
        viewModelScope.launch {
            val newItem = alarmItem.copy(enabled = !alarmItem.enabled)
            editAlarmItemUseCase.editAlarmItem(newItem)
        }
    }
}