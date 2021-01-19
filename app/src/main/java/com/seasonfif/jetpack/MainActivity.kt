package com.seasonfif.jetpack

import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.seasonfif.jetpack.ui.dashboard.DashboardFragment
import com.seasonfif.jetpack.ui.home.HomeFragment
import com.seasonfif.jetpack.ui.notifications.NotificationsFragment
import com.seasonfif.jetpack.ui.self.SelfFragment
import com.seasonfif.jetpack.view.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var pagerAdapter: ViewPagerAdapter

    private val itemSelectedListener : BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home->{
                    pager.currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_message->{
                    pager.currentItem = 1
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_dashboard->{
                    pager.currentItem = 2
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_self->{
                    pager.currentItem = 3
                    return@OnNavigationItemSelectedListener true
                }

                else -> {
                    pager.currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }
            }
        }


    private var pagerChangeListener = object : ViewPager.OnPageChangeListener{

        private var item : MenuItem? = null

        override fun onPageScrollStateChanged(p0: Int) {
        }

        override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
        }

        override fun onPageSelected(position: Int) {
            if (item != null){
                item!!.isChecked = false
            }else{
                bottom_nav.menu.getItem(0).isChecked = false
            }
            item = bottom_nav.menu.getItem(position)
            item?.isChecked = true
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(HomeFragment.newInstance())
        pagerAdapter.addFragment(NotificationsFragment.newInstance())
        pagerAdapter.addFragment(DashboardFragment.newInstance())
        pagerAdapter.addFragment(SelfFragment.newInstance())

        pager.setCanScroll(true)
        pager.offscreenPageLimit = 2
        pager.adapter = pagerAdapter
        pager.addOnPageChangeListener(pagerChangeListener)

        //同时显示图标和文字
        bottom_nav.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottom_nav.setOnNavigationItemSelectedListener(itemSelectedListener)

    }
}