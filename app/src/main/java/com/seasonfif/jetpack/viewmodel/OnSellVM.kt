package com.seasonfif.jetpack.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.seasonfif.jetpack.base.BaseViewModel
import com.seasonfif.jetpack.bean.SellData
import com.seasonfif.jetpack.repository.OnSellRepository
import kotlinx.coroutines.launch

class OnSellVM: BaseViewModel() {

    companion object {
        const val DEFAULT_PAGE = 1
    }

    val contentList = MutableLiveData<List<SellData>>()

    private val onSellRepository by lazy {
        OnSellRepository()
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
            val apiData = onSellRepository.getOnSellList(currentPage, true)
            val mapDataList = apiData.tbk_dg_optimus_material_response.result_list.map_data
            Log.e("data size == ", "" + mapDataList.size)
            contentList.postValue(mapDataList)
        }
    }
}