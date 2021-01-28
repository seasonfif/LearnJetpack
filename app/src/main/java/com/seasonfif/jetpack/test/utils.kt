package com.seasonfif.jetpack.test

fun log(msg: String){
    println("${Thread.currentThread().name}--->$msg")
}