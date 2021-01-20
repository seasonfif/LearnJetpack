package com.seasonfif.jetpack.ui.self

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.base.BaseFragment

class SelfFragment : BaseFragment() {

    private lateinit var selfViewModel: SelfViewModel

    companion object{
        fun newInstance(): Fragment{
            val args = Bundle()

            val fragment = SelfFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        selfViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(SelfViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_self, container, false)
        val textView: TextView = root.findViewById(R.id.text_self)
        selfViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}