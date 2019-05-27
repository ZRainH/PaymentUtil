package com.pay.utils.factory.alipay

import android.app.Activity
import com.pay.utils.factory.listener.OnPayLinstener

interface AliPayment {

    fun startAliPayment(activity: Activity, orderInfo: String, listener: OnPayLinstener)
}