package com.cleancode.houseutils.controller

import com.cleancode.houseutils.constants.ActionType
import com.cleancode.houseutils.policy.BrokeragePolicy
import com.cleancode.houseutils.policy.BrokeragePolicyFactory
import com.cleancode.houseutils.service.ApartmentService
import org.springframework.web.bind.annotation.*

/**
 * 중개수수료가 얼마인지 질의하는 컨트롤러
 *
 * @author chulhee.lee
 */
@RestController
@RequestMapping("/api")
class BrokerageQueryController(
    private val apartmentService: ApartmentService
) {

    @GetMapping("/calc/brokerage")
    fun calculateBrokerage(
        @RequestParam actionType: ActionType,
        @RequestParam price: Long,
    ): Long {
        return BrokeragePolicyFactory.of(actionType).calculate(price)
    }

    @GetMapping("/calc/brokerage/apartment/{id}")
    fun calcBrokerageByApartmentId(
        @PathVariable id: Long,
        @RequestParam actionType: ActionType
    ) : Long {

        return BrokeragePolicyFactory.of(actionType).calculate(apartmentService.getPriceById(id))
    }
}
