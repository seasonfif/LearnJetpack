package com.seasonfif.jetpack.net

data class ResultData<T>(
    private val success: Boolean,
    private val code: Int,
    private val message: String,
    private val data: T) {

    companion object{
        const val SUCCESS_CODE = 10000
    }

    fun getApiData():T =
        if (code == SUCCESS_CODE){
            data
        }else{
            throw ApiException(code, message)
        }

}