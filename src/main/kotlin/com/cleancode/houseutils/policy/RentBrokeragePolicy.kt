package com.cleancode.houseutils.policy

class RentBrokeragePolicy: BrokeragePolicy {

    override fun createBrokerageRule(price: Long) : BrokerageRule {
      return if (price < 50_000_000) {
          BrokerageRule(0.5F, 200_000)
      } else if (price < 100_000_000) {
          BrokerageRule(0.4F, 300_000)
      } else if (price < 300_000_000) {
          BrokerageRule(0.3F)
      } else if (price < 600_000_000) {
          BrokerageRule(0.4F)
      } else {
          BrokerageRule(0.8F)
      }

    }
}
