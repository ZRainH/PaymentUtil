package com.pay.utils.factory.listener

interface OnPayLinstener {

    fun onSuccess()

    fun onFailure(errorCode : String,errorMsg : String)

    fun onComplete()
}