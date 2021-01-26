package com.seasonfif.jetpack.repository

import com.seasonfif.jetpack.bean.ProjectData
import com.seasonfif.jetpack.net.ApiService
import com.seasonfif.jetpack.net.NetConstants
import com.seasonfif.jetpack.net.ResultEntry
import com.seasonfif.jetpack.net.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class HotProjectRepository {

    private suspend fun getHotProjectList(page: Int): ResultEntry<ProjectData> =
        RetrofitClient.createService(ApiService::class.java).getHotProjectList(page)

    suspend fun getHotProjectList(page: Int, isLocal: Boolean) : ProjectData =
        if (isLocal){
            Thread.sleep(3000)
            Utils.string2bean(NetConstants.LOCAL, ProjectData::class.java)
        }else{
            getHotProjectList(page).getProjects()
        }

    suspend fun getProjectList(page: Int) = suspendCoroutine<ProjectData> { continuation ->

            val projectListCall = RetrofitClient.createService(ApiService::class.java).getProjectList(page)
            projectListCall.enqueue(object : Callback<ResultEntry<ProjectData>> {

                override fun onResponse(
                    call: Call<ResultEntry<ProjectData>>,
                    response: Response<ResultEntry<ProjectData>>
                ) {
                    continuation.resume(response.body()!!.getProjects())
                }

                override fun onFailure(call: Call<ResultEntry<ProjectData>>, t: Throwable) {
                    continuation.resumeWithException(t)
                }
            })
        }
}