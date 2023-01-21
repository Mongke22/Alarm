package com.example.alarm.domain.UseCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: AlarmItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
