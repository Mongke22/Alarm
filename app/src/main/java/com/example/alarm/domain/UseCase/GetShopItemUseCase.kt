package com.example.alarm.domain.UseCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): AlarmItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
