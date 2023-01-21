package com.example.alarm.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<AlarmItem>> {
        return shopListRepository.getShopList()
    }
}
