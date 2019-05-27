package com.pay.utils.factory

import com.pay.utils.factory.alipay.AliPayment
import com.pay.utils.factory.union.UnionPayment

interface PaymentFactory {

    fun createAliPayment() : AliPayment

    fun createUnionPayment() : UnionPayment

}