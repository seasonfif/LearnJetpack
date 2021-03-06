package com.seasonfif.jetpack.net

import com.seasonfif.jetpack.bean.ProjectData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("project/list/{page}/json?cid=294")
    suspend fun getHotProjectList(@Path("page") page: Int): ResultEntry<ProjectData>

    @GET("project/list/{page}/json?cid=294")
    fun getProjectList(@Path("page") page: Int): Call<ResultEntry<ProjectData>>

}