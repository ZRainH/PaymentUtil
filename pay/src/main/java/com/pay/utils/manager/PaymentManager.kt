package com.pay.utils.manager

import android.app.Activity
import android.content.Context
import com.pay.utils.factory.PaymentProduct
import com.pay.utils.factory.alipay.AliPaymentProduct
import com.pay.utils.factory.union.UnionPaymentProduct
import com.pay.utils.listener.OnPayListener

object PaymentManager {

    private val mAliPay: AliPaymentProduct by lazy {
        PaymentProduct().createAliPayment() as AliPaymentProduct
    }

    private val mUnionPay: UnionPaymentProduct by lazy {
        PaymentProduct().createUnionPayment() as UnionPaymentProduct
    }

    fun startUnionPay(context: Context, tn: String, isDebug: Boolean, listener: OnPayListener) {
        mUnionPay.startUnionPayment(context, tn, isDebug, listener)
    }

    fun startAliPay(activity: Activity, orderInfo: String, listener: OnPayListener) {
        mAliPay.startAliPayment(activity, orderInfo, listener)
    }
}