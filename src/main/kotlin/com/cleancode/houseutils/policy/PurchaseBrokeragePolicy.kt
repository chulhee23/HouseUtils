package com.cleancode.houseutils.policy

/**
 * 매매일 때 중개수수료 계산하는 클래스
 */
class PurchaseBrokeragePolicy : BrokeragePolicy {
    override fun createBrokerageRule(price: Long) = if (price < 50_000_000) {
        BrokerageRule(0.6F, 250_000)
    } else if (price < 200_000_000) {
        BrokerageRule(0.5F, 250_000)
    } else if (price < 600_000_000) {
        BrokerageRule(0.4F)
    } else if (price < 900_000_000) {
        BrokerageRule(0.5F)
    } else {
        BrokerageRule(0.9F)

    }
}
