package com.seasonfif.jetpack.ui.dashboard

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scwang.smart.refresh.header.ClassicsHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.base.BaseFragment
import com.seasonfif.jetpack.bean.SellData
import com.seasonfif.jetpack.viewmodel.OnSellVM

class DashboardFragment : BaseFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var refreshLayout: SmartRefreshLayout
    private lateinit var recycler: RecyclerView
    private lateinit var sellAdapter: SellAdapter

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
        refreshLayout = root.findViewById(R.id.refreshLayout)
        recycler = root.findViewById(R.id.recycler)

        refreshLayout.setRefreshHeader(ClassicsHeader(activity))
        refreshLayout.setEnableRefresh(true)
        refreshLayout.setOnRefreshListener {
            onSellVM.refresh()
            onSellVM.contentList.observe(this,
                Observer<List<SellData>> {
                    if (it?.size!! > 0){
                        refreshLayout.finishRefresh(true)
                    }else{
                        refreshLayout.finishRefresh(false)
                    }
                    sellAdapter.setNewData(it)
                })
        }
        recycler.layoutManager = LinearLayoutManager(activity)

        sellAdapter = SellAdapter(R.layout.item_onsell)

        recycler.adapter = sellAdapter

        onSellVM.refresh()
        onSellVM.contentList.observe(this,
            Observer<List<SellData>> {
                sellAdapter.setNewData(it)
            })

        return root
    }
}