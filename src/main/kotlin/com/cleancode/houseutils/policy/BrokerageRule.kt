package com.cleancode.houseutils.policy

/**
 * 가격이 특정 범위일 때
 * 상한효율과 상한금 가지는 클래스
 */
class BrokerageRule(
    private val brokeragePercent: Float,
    private val limitAmount: Long? = null,
) {

    fun calculateMaxBrokerage(price: Long): Long {
        return if (limitAmount == null) {
            multiplyPercent(price)
        } else {
            minOf(multiplyPercent(price), limitAmount)
        }
    }

    private fun multiplyPercent(price: Long) = (brokeragePercent / 100 * price).toLong()


}
