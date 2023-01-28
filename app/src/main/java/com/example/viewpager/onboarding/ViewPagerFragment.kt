package com.example.viewpager.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.R
import com.example.viewpager.onboarding.screens.FirstScreen
import com.example.viewpager.onboarding.screens.SecondScreen
import com.example.viewpager.onboarding.screens.ThirdScreen

class ViewPagerFragment: Fragment(R.layout.fragment_view_pager) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  super.onCreateView(inflater, container, savedInstanceState)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view?.findViewById<ViewPager2>(R.id.viewPager)?.adapter = adapter

        return view
    }
}