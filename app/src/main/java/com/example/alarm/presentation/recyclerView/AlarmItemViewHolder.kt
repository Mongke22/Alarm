package com.example.alarm.presentation.recyclerView

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.alarm.R

class AlarmItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val tvName = view.findViewById<TextView>(R.id.tv_name)
    val tvTime = view.findViewById<TextView>(R.id.tv_time)
    val tvDate = view.findViewById<TextView>(R.id.tv_date)
    val svEnabled = view.findViewById<SwitchCompat>(R.id.sw_enabled)
}