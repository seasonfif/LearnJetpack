package com.seasonfif.jetpack.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter : FragmentPagerAdapter {

    private var fragments: MutableList<Fragment> = mutableListOf()

    constructor(fm: FragmentManager?) : super(fm)

    fun addFragment(f: Fragment){
        fragments.add(f)
    }

    override fun getItem(index: Int): Fragment {
        return fragments[index]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}