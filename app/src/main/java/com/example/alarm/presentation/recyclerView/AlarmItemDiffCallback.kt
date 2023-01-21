package com.example.alarm.presentation.recyclerView

import androidx.recyclerview.widget.DiffUtil
import com.example.alarm.domain.AlarmItem

class AlarmItemDiffCallback: DiffUtil.ItemCallback<AlarmItem>() {

    override fun areItemsTheSame(oldItem: AlarmItem, newItem: AlarmItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: AlarmItem, newItem: AlarmItem): Boolean {
        return oldItem == newItem
    }
}