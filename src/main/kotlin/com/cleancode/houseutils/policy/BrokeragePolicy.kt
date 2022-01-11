package com.cleancode.houseutils.policy

import org.springframework.stereotype.Component

@Component
interface BrokeragePolicy {

    fun calculate(price: Long): Long {
        val rule = createBrokerageRule(price)
        return rule.calculateMaxBrokerage(price)
    }

    fun createBrokerageRule(price: Long): BrokerageRule

}
