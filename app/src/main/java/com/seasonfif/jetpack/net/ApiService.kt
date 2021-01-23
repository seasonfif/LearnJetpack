package com.seasonfif.jetpack.net

import com.seasonfif.jetpack.bean.OnSellData
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("onSell/{page}")
    suspend fun getOnSellList(@Path("page") page: Int): ResultData<OnSellData>

}