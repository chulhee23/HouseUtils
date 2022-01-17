package com.cleancode.houseutils.policy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class BrokeragePolicyTest {
    lateinit var rentBrokeragePolicy: RentBrokeragePolicy
    lateinit var purchaseBrokeragePolicy: PurchaseBrokeragePolicy

    @BeforeEach
    fun setUp() {
        rentBrokeragePolicy = RentBrokeragePolicy()
        purchaseBrokeragePolicy = PurchaseBrokeragePolicy()
    }


    @Test
    fun testPurchaseBrokeragePolicy() {

        Assertions.assertEquals(
            purchaseBrokeragePolicy.calculate(30_000_000L), 180_000L
        )
        Assertions.assertEquals(
            purchaseBrokeragePolicy.calculate(100_000_000L), 500_000L
        )

        Assertions.assertEquals(
            purchaseBrokeragePolicy.calculate(500_000_000L), 2_000_000L
        )
    }

    @Test
    fun testRentBrokeragePolicy() {

        Assertions.assertEquals(
            rentBrokeragePolicy.calculate(30_000_000L), 150_000L
        )
        Assertions.assertEquals(
            rentBrokeragePolicy.calculate(100_000_000L), 300_000L
        )

        Assertions.assertEquals(
            rentBrokeragePolicy.calculate(500_000_000L), 2_000_000L
        )
    }


}
