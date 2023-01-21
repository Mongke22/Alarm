package com.example.alarm.domain.UseCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun addShopItem(shopItem: AlarmItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
