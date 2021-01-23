package com.seasonfif.jetpack.ui.dashboard

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.base.BaseFragment
import com.seasonfif.jetpack.bean.MapData
import com.seasonfif.jetpack.viewmodel.OnSellVM

class DashboardFragment : BaseFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    private val onSellVM by lazy {
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(OnSellVM::class.java)
    }

    companion object{
        fun newInstance(): Fragment{
            val args = Bundle()

            val fragment = DashboardFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        /*val onSellVM = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(OnSellVM::class.java)*/

        onSellVM.refresh()
        onSellVM.contentList.observe(this,
            Observer<List<MapData>> {
                textView.text = it?.get(0)?.click_url
            })

        return root
    }
}