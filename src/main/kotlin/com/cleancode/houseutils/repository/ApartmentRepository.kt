package com.cleancode.houseutils.repository

import com.cleancode.houseutils.entity.Apartment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ApartmentRepository : JpaRepository<Apartment, Long> {
}
