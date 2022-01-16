package com.cleancode.houseutils.exception

class HouseUtilsException(
    errorCode: ErrorCode,
) : RuntimeException() {
    override val message : String = errorCode.message

}
