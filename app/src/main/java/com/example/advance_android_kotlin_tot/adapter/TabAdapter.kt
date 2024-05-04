package com.example.advance_android_kotlin_tot.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.advance_android_kotlin_tot.fragments.ChatFragment
import com.example.advance_android_kotlin_tot.fragments.StatusFragment

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

     override fun getItemCount(): Int {
       return  2
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position)
        {
            0 -> ChatFragment()
            1 -> StatusFragment()
            else -> ChatFragment()
        }
    }
}