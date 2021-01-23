package com.seasonfif.jetpack.repository

import com.seasonfif.jetpack.bean.OnSellData
import com.seasonfif.jetpack.net.ApiService
import com.seasonfif.jetpack.net.ResultData
import com.seasonfif.jetpack.net.RetrofitClient

class OnSellRepository {

    suspend fun getOnSellList(page: Int): ResultData<OnSellData> =
        RetrofitClient.createService(ApiService::class.java).getOnSellList(page)
}