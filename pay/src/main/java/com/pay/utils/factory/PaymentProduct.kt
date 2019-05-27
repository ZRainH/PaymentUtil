package com.pay.utils.factory

import com.pay.utils.factory.alipay.AliPayment
import com.pay.utils.factory.alipay.AliPaymentProduct
import com.pay.utils.factory.union.UnionPayment
import com.pay.utils.factory.union.UnionPaymentProduct

class PaymentProduct : PaymentFactory {
    override fun createAliPayment(): AliPayment {
        return AliPaymentProduct()
    }

    override fun createUnionPayment(): UnionPayment {
        return UnionPaymentProduct()
    }


}