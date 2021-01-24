package com.seasonfif.jetpack.net

class ApiException(var code: Int, msg: String) : RuntimeException(msg){

}