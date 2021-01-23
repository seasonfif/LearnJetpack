package com.seasonfif.jetpack.net

class ApiException : RuntimeException{

    constructor(msg: String): super(msg)

    constructor(code: Int, msg: String): super(msg)

}