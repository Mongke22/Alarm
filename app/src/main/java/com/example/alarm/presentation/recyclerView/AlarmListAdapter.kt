package com.example.alarm.presentation.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.alarm.R
import com.example.alarm.domain.AlarmItem

class AlarmListAdapter: ListAdapter<AlarmItem, AlarmItemViewHolder>(AlarmItemDiffCallback()) {
    var onAlarmItemClickListener: ((AlarmItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmItemViewHolder {
        val layout = when (viewType) {
            VIEW_TYPE_DISABLED -> R.layout.item_alarm_disabled
            VIEW_TYPE_ENABLED -> R.layout.item_alarm_enabled
            else -> throw RuntimeException("Unknown view type: $viewType")
        }
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return AlarmItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: AlarmItemViewHolder, position: Int) {
        val alarmItem = getItem(position)
        viewHolder.view.setOnClickListener {
            onAlarmItemClickListener?.invoke(alarmItem)
        }
        viewHolder.tvName.text = alarmItem.name
        viewHolder.svEnabled.isEnabled = alarmItem.enabled
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item.enabled) {
            VIEW_TYPE_ENABLED
        } else {
            VIEW_TYPE_DISABLED
        }
    }

    companion object {

        const val VIEW_TYPE_ENABLED = 100
        const val VIEW_TYPE_DISABLED = 101

        const val MAX_POOL_SIZE = 30
    }
}