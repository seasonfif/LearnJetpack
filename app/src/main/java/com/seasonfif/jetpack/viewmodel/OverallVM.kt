package com.seasonfif.jetpack.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class OverallVM : ViewModel(){

    private var tag: MutableLiveData<String> = MutableLiveData()

    private var badge: MutableLiveData<Int> = MutableLiveData()


    fun getTag(): MutableLiveData<String>{
        return tag
    }

    fun getBadge(): MutableLiveData<Int>{
        return badge
    }
}