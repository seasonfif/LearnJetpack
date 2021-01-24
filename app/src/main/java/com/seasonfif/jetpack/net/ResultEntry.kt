package com.seasonfif.jetpack.net

data class ResultEntry<T>(
    private val errorCode: Int,
    private val errorMsg: String,
    private val data: T) {

    companion object{
        const val SUCCESS_CODE = 0
    }

    fun getProjects():T =
        if (errorCode == SUCCESS_CODE){
            data
        }else{
            throw ApiException(errorCode, errorMsg)
        }

}