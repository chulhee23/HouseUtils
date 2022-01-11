package com.cleancode.houseutils.policy

import com.cleancode.houseutils.constants.ActionType

class BrokeragePolicyFactory {
    companion object {

        fun of(actionType: ActionType): BrokeragePolicy {
            return when(actionType) {
                ActionType.RENT -> RentBrokeragePolicy()
                ActionType.PURCHASE -> PurchaseBrokeragePolicy()
            }
        }

    }


}
