package com.seasonfif.jetpack.ui.dashboard

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.scwang.smart.refresh.header.ClassicsHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.base.BaseFragment
import com.seasonfif.jetpack.bean.ProjectItem
import com.seasonfif.jetpack.viewmodel.HotProjectVM
import com.seasonfif.jetpack.viewmodel.HotProjectVM.Companion.REFRESH_MODE

class DashboardFragment : BaseFragment() {

    private val TAG = DashboardFragment.javaClass.simpleName
    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var refreshLayout: SmartRefreshLayout
    private lateinit var recycler: RecyclerView
    private lateinit var hotProjectAdapter: HotProjectAdapter

    private val hotProjectVM by lazy {
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HotProjectVM::class.java)
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
            hotProjectVM.refresh()
        }
        recycler.layoutManager = LinearLayoutManager(activity)

        hotProjectAdapter = HotProjectAdapter(R.layout.item_hot_project)
        hotProjectAdapter.setOnItemClickListener { adapter, view, position ->
            val item = hotProjectAdapter.getItem(position)
            Toast.makeText(activity, item?.title, Toast.LENGTH_SHORT).show()
        }

        hotProjectAdapter.setOnLoadMoreListener({
            hotProjectVM.loadmore()
        }, recycler)

        recycler.adapter = hotProjectAdapter

        hotProjectVM.refresh()
        hotProjectVM.contentList.observe(this,
            Observer<List<ProjectItem>> {
                Log.e(TAG, "update view, mode=${hotProjectVM.mode}")

                if (it == null){
                    Log.e(TAG, "网络请求异常")
                    if (hotProjectVM.mode == REFRESH_MODE){
                        refreshLayout.finishRefresh(false)
                    }else{
                        hotProjectAdapter.loadMoreFail()
                    }

                }else{
                    if (hotProjectVM.mode == REFRESH_MODE){
                        if (it?.size!! > 0){
                            refreshLayout.finishRefresh(true)
                        }else{
                            refreshLayout.finishRefresh(false)
                        }
                        hotProjectAdapter.setNewData(it)
                        //是否打开加载更多，如果当前数据满屏则会打开
                        hotProjectAdapter.disableLoadMoreIfNotFullPage(recycler)
                    }else{
                        if (it?.size!! > 0){
                            hotProjectAdapter.loadMoreComplete()
                        }else{
                            hotProjectAdapter.loadMoreFail()
                        }
                        hotProjectAdapter.addData(it!!)
                    }
                }
            })

        return root
    }
}