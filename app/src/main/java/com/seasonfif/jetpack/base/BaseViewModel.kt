package com.seasonfif.jetpack.base

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

open class BaseViewModel : ViewModel() {

    private val viewModelJob = SupervisorJob()
    val viewModelScope = CoroutineScope(viewModelJob)

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}