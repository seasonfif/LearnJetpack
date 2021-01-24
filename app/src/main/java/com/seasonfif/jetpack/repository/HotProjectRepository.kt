package com.seasonfif.jetpack.repository

import com.seasonfif.jetpack.bean.ProjectData
import com.seasonfif.jetpack.net.ApiService
import com.seasonfif.jetpack.net.NetConstants
import com.seasonfif.jetpack.net.ResultEntry
import com.seasonfif.jetpack.net.RetrofitClient

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
}