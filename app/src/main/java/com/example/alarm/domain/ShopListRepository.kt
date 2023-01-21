package com.example.alarm.domain

import androidx.lifecycle.LiveData
import com.example.alarm.domain.AlarmItem

interface ShopListRepository {

    suspend fun addShopItem(shopItem: AlarmItem)

    suspend fun deleteShopItem(shopItem: AlarmItem)

    suspend fun editShopItem(shopItem: AlarmItem)

    suspend fun getShopItem(shopItemId: Int): AlarmItem

    fun getShopList(): LiveData<List<AlarmItem>>
}
