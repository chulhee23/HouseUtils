package com.cleancode.houseutils.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/api/ping")
    fun ping() = "ok"
}
