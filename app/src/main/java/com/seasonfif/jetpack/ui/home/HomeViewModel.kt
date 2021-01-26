package com.seasonfif.jetpack.ui.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val isLoading: MutableLiveData<Boolean> = MutableLiveData()
}