package com.seasonfif.jetpack.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.seasonfif.jetpack.base.BaseViewModel
import com.seasonfif.jetpack.bean.ProjectItem
import com.seasonfif.jetpack.repository.HotProjectRepository
import kotlinx.coroutines.launch

class HotProjectVM: BaseViewModel() {

    companion object {
        const val DEFAULT_PAGE = 1
    }

    val contentList = MutableLiveData<List<ProjectItem>>()

    private val hotProjectRepository by lazy {
        HotProjectRepository()
    }

    private var currentPage: Int = DEFAULT_PAGE

    fun refresh(){
        currentPage = DEFAULT_PAGE
        loadListByPage()
    }

    fun loadmore(){
        currentPage ++
        loadListByPage()
    }

    private fun loadListByPage() {
        viewModelScope.launch {
            val apiData = hotProjectRepository.getHotProjectList(currentPage, false)
            val dataList = apiData.datas
            Log.e("data size == ", "" + dataList.size)
            contentList.postValue(dataList)
        }
    }
}