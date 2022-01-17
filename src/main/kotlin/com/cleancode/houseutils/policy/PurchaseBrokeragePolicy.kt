package com.cleancode.houseutils.policy

/**
 * 매매일 때 중개수수료 계산하는 클래스
 */
class PurchaseBrokeragePolicy : BrokeragePolicy {

    override fun createBrokerageRule(price: Long): BrokerageRule {
        return when {
            (price < 50_000_000) -> BrokerageRule(0.6F, 250_000)
            (price < 200_000_000) -> BrokerageRule(0.5F, 800_000)
            (price < 600_000_000) -> BrokerageRule(0.4F)
            (price < 900_000_000) -> BrokerageRule(0.5F)
            else -> BrokerageRule(0.9F)
        }

    }


}
