package com.seasonfif.jetpack.repository

import com.google.gson.Gson

object Utils {

    private val gson = Gson()

    fun <T> string2bean(str: String, clazz: Class<T>): T =
        gson.fromJson(str, clazz)
}