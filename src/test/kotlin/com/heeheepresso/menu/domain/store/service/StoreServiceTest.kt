package com.heeheepresso.menu.domain.store.service

import com.heeheepresso.menu.domain.store.model.Store
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StoreServiceTest @Autowired constructor(
        private val storeService: StoreService
) {

    @Test
    fun `test save`() {
        // given
        val store = Store(
                id = null,
                name = "강남",
                hasDecaffeinatedMenu = false,
                hasGrilledMenu = false,
                isDirectManagedStore = false,
                isDeliveryAvailable = false,
                thumbnailUrl = "url",
//                address = Address(roadName = "서울 강남구 테헤란로4길 46", detail = "쌍용플래티넘 1층", longitude = 0.0F, latitude = 0.0F),
//                openingHours = listOf(OpeningHour(LocalTime.of(9, 0), LocalTime.of(18,0))),
        )
        // when
        val result = storeService.save(store)

        // then
        assertNotNull(result)
        assertEquals(Store::class.java, result.javaClass)
    }

    @Test
    fun `test findStoreById`() {
        // given
        val store = Store(
                id = null,
                name = "강남",
                hasDecaffeinatedMenu = false,
                hasGrilledMenu = false,
                isDirectManagedStore = false,
                isDeliveryAvailable = false,
                thumbnailUrl = "url",
//                address = Address(roadName = "서울 강남구 테헤란로4길 46", detail = "쌍용플래티넘 1층", longitude = 0.0F, latitude = 0.0F),
//                openingHours = listOf(OpeningHour(LocalTime.of(9, 0), LocalTime.of(18,0))),
        )
        val givenStore = storeService.save(store)

        // when
        val result = storeService.findStoreById(givenStore.id!!).get()

        // then
        assertEquals(store.name, result.name)
        assertEquals(store.hasDecaffeinatedMenu, result.hasDecaffeinatedMenu)
        assertEquals(store.hasGrilledMenu, result.hasGrilledMenu)
        assertEquals(store.isDirectManagedStore, result.isDirectManagedStore)
        assertEquals(store.isDeliveryAvailable, result.isDeliveryAvailable)
        assertEquals(store.thumbnailUrl, result.thumbnailUrl)
    }
}