package com.seasonfif.jetpack.ui.home

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

class HomeFragment : BaseFragment() {

    private lateinit var homeViewModel: HomeViewModel

    companion object{

        fun newInstance(): Fragment {
            val args = Bundle()

            var fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        activity?.let { activity ->
            overallVM.getTag().observe(activity, Observer {
                textView.text = it
            })
        }

        return root
    }
}