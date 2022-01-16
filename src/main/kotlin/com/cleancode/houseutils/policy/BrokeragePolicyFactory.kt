package com.cleancode.houseutils.policy

import com.cleancode.houseutils.constants.ActionType
import com.cleancode.houseutils.exception.ErrorCode
import com.cleancode.houseutils.exception.HouseUtilsException

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
