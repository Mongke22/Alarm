package com.example.alarm.domain.UseCase

import com.example.alarm.domain.AlarmItem
import com.example.alarm.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun editShopItem(shopItem: AlarmItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
