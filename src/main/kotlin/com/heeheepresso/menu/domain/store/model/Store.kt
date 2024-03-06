package com.heeheepresso.menu.domain.store.model

import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalTime

@Entity
data class Store(
        @Id
        @GeneratedValue
        var id: Long?,
        val name: String,
        val hasDecaffeinatedMenu: Boolean,
        val hasGrilledMenu: Boolean,
        val isDeliveryAvailable: Boolean,
        val isDirectManagedStore: Boolean,
        val thumbnailUrl: String,
        @Embedded
        val address: Address,
        @Embedded
        val openingHours: OpeningHour
)

@Embeddable
data class Address(
        val roadName: String,
        val detail: String,
        val longitude: Float,
        val latitude: Float,
)

@Embeddable
data class OpeningHour(
        val startTime: LocalTime,
        val endTime: LocalTime,
)