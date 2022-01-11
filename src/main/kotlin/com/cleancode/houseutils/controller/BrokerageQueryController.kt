package com.cleancode.houseutils.controller

import com.cleancode.houseutils.constants.ActionType
import com.cleancode.houseutils.policy.BrokeragePolicy
import com.cleancode.houseutils.policy.BrokeragePolicyFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * 중개수수료 질의 컨트롤러
 */
@RestController
@RequestMapping("/api")
class BrokerageQueryController {

    @GetMapping("/calc/brokerage")
    fun calculateBrokerage(
        @RequestParam actionType: ActionType,
        @RequestParam price: Long,
    ): Long {
        return BrokeragePolicyFactory.of(actionType).calculate(price)
    }
}
