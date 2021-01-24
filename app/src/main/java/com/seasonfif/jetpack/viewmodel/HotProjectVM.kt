package com.seasonfif.jetpack.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.seasonfif.jetpack.base.BaseViewModel
import com.seasonfif.jetpack.bean.ProjectItem
import com.seasonfif.jetpack.net.ApiException
import com.seasonfif.jetpack.repository.HotProjectRepository
import kotlinx.coroutines.launch

class HotProjectVM: BaseViewModel() {

    companion object {
        const val DEFAULT_PAGE = 1
        const val REFRESH_MODE = 1
        const val LOAD_MODE = 2
    }

    val contentList = MutableLiveData<List<ProjectItem>>()
    var mode = REFRESH_MODE

    private val hotProjectRepository by lazy {
        HotProjectRepository()
    }

    private var currentPage: Int = DEFAULT_PAGE

    fun refresh(){
        mode = REFRESH_MODE
        currentPage = DEFAULT_PAGE
        loadListByPage()
    }

    fun loadmore(){
        mode = LOAD_MODE
        currentPage ++
        loadListByPage()
    }

    private fun loadListByPage() {
        viewModelScope.launch {
            try {
                val apiData = hotProjectRepository.getHotProjectList(currentPage, false)
                val dataList = apiData.datas
                Log.e("data size == ", "" + dataList.size)
                contentList.postValue(dataList)
            }catch (apiException: ApiException){
                apiException.code
                contentList.postValue(null)
            }catch (e : Exception){
                contentList.postValue(null)
            }
        }
    }
}