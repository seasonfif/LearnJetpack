package com.seasonfif.jetpack.test

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

fun main() {
    log("开始执行")
    GlobalScope.launch {
        log("协程执行,遇到延迟")
        delay(1000)
        log("延迟完毕,继续执行")
    }

    log("携程后代码")

    runBlocking {
        delay(2000)
    }

//    Thread.sleep(2000)
    log("休眠完毕,运行结束")
}

class TeseScope : CoroutineScope{

    override val coroutineContext: CoroutineContext
        get() = EmptyCoroutineContext

    fun test(){
        launch {
            coroutineScope {

            }

            supervisorScope {

            }
        }

        MainScope().launch {

        }


    }

}