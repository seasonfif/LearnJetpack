package com.seasonfif.jetpack.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.seasonfif.jetpack.bean.MapData
import com.seasonfif.jetpack.repository.OnSellRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class OnSellVM: ViewModel() {

    companion object {
        const val DEFAULT_PAGE = 1
    }

    private val viewModelJob = SupervisorJob()
    private val viewModelScope = CoroutineScope(viewModelJob)

    val contentList = MutableLiveData<List<MapData>>()

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
            val apiData = onSellRepository.getOnSellList(currentPage).getApiData()
            val mapDataList = apiData.tbk_dg_optimus_material_response.result_list.map_data
            Log.e("data size == ", "" + mapDataList.size)
            contentList.postValue(mapDataList)
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob?.cancel()
    }

}