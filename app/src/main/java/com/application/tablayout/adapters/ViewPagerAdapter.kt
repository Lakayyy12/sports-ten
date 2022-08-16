package com.application.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.tablayout.fragments.FragmentGuide
import com.application.tablayout.fragments.FragmentTip
import com.application.tablayout.fragments.FragmentWay

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3

    }

    override fun createFragment(position: Int): Fragment {
       return when (position) {
            0 -> {
                FragmentWay()
            }
            1 -> {
                FragmentTip()
            }
            2 -> {
                FragmentGuide()
            }
            else -> {
                Fragment()
            }
        }
    }
}





