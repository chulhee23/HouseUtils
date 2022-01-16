package com.cleancode.houseutils.service

import com.cleancode.houseutils.exception.NotFoundException
import com.cleancode.houseutils.repository.ApartmentRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ApartmentService(
    private val repository: ApartmentRepository
) {

    fun getPriceById(id: Long) : Long {
        return repository.getById(id).price
    }
}
