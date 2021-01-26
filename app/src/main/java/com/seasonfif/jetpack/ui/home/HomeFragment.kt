package com.seasonfif.jetpack.ui.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.seasonfif.jetpack.R
import com.seasonfif.jetpack.base.BaseFragment
import com.seasonfif.jetpack.bean.ProjectData
import com.seasonfif.jetpack.net.ApiException
import com.seasonfif.jetpack.net.ResultEntry
import com.seasonfif.jetpack.repository.HotProjectRepository
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class HomeFragment : BaseFragment() {

    private val TAG = HomeFragment.javaClass.simpleName

    private lateinit var textView: TextView

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
        textView = root.findViewById(R.id.text_home)
        val btn: Button = root.findViewById(R.id.btn)

        homeViewModel.isLoading.observe(this, Observer {
            loading ->
            if (loading!!){
                progressBar.visibility = View.VISIBLE
                textView.text = "loading..."
            }else{
                progressBar.visibility = View.INVISIBLE
            }
        })

        btn.setOnClickListener {
            getResultEntry()
        }

        return root
    }

    private fun getResultEntry() {
        homeViewModel.isLoading.value = true

        CoroutineScope(Dispatchers.Main).launch {
            Log.e(TAG, "当前线程1-${Thread.currentThread().name}")
            val resultEntry: ResultEntry<ProjectData>
            /*resultEntry = withContext(Dispatchers.IO){
                Log.e(TAG, "当前线程2-${Thread.currentThread().name}")
                delay(3000)
                RetrofitClient.createService(ApiService::class.java).getHotProjectList(1)
            }*/

            /*val defer = async(Dispatchers.Main) {
                Log.e(TAG, "当前线程2-${Thread.currentThread().name}")
                delay(3000)
                RetrofitClient.createService(ApiService::class.java).getHotProjectList(1)
            }
            resultEntry = defer.await()*/

            try {
                delay(3000)
                textView.text = readFile(0)
                homeViewModel.isLoading.value = false

            }catch (e: Exception){
                textView.text =e.message
                homeViewModel.isLoading.value = false
            }

//            getProjects()

//            homeViewModel.isLoading.value = false
//            textView.text = resultEntry.getProjects().pageCount.toString()
        }

    }

     private suspend fun readFile(mode: Int) = suspendCoroutine<String>{ continuation ->

        if (mode == 0){
            continuation.resume("io success")
        }else{
            continuation.resumeWithException(ApiException(mode, "io failed"))
        }
    }


    private suspend fun getProjects(){
        var projects : ProjectData

        try {
            delay(3000)
            projects = HotProjectRepository().getProjectList(1)
            textView.text = projects.offset.toString()
            homeViewModel.isLoading.value = false
        }catch(e: Exception){

            delay(3000)
            textView.text = e.message
            homeViewModel.isLoading.value = false
        }
    }
}