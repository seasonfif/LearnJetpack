package com.seasonfif.jetpack.base

import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import android.support.v4.app.Fragment
import com.seasonfif.jetpack.viewmodel.OverallVM

open class BaseFragment : Fragment() {

    lateinit var overallVM: OverallVM

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        activity?.apply {
            overallVM = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(OverallVM::class.java)
        }
    }

}