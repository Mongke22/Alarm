package com.example.alarm.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alarm.databinding.FragmentAlertEditBinding


class AlertEditFragment : Fragment() {

    private var _binding: FragmentAlertEditBinding? = null
    private val binding: FragmentAlertEditBinding
        get() = _binding ?: throw RuntimeException("FragmentShopItemBinding == null")
    private var screenMode: String = MODE_UNKNOWN


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlertEditBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        private const val SCREEN_MODE = "extra_mode"
        private const val MODE_EDIT = "mode_edit"
        private const val MODE_ADD = "mode_add"
        private const val MODE_UNKNOWN = ""


        fun newInstance() =
            AlertEditFragment().apply {
                arguments = Bundle().apply {
                    putString(SCREEN_MODE, MODE_ADD)
                }
            }
    }
}