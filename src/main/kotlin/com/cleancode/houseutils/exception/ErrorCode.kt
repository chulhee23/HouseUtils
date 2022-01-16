package com.cleancode.houseutils.exception

enum class ErrorCode(
    val message: String,
) {
    INVALID_REQUEST("잘못된 요청입니다."),
    INTERNAL_ERROR("알 수 없는 에러입니다"),
    ENTITY_NOT_FOUND("존재하지 않습니다."),
}
