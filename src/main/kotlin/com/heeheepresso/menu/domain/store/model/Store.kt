package com.heeheepresso.menu.domain.store.model

import java.time.LocalTime

class Store(
        val id: Long?,
        val name: String,
        val hasDecaffeinatedMenu: Boolean,
        val hasGrilledMenu: Boolean,
        val isDeliveryAvailable: Boolean,
        val isDirectManagedStore: Boolean,
        val thumbnailUrl: String,
        val address: Address,
        val openingHours: List<OpeningHour>
)

data class Address(
        val roadName: String,
        val detail: String,
        val longitude: Float,
        val latitude: Float,
)

data class OpeningHour(
        val startTime: LocalTime,
        val endTime: LocalTime,
)