package com.heeheepresso.menu.domain.store.service

import com.heeheepresso.menu.domain.store.model.Store
import com.heeheepresso.menu.domain.store.repository.StoreRepository
import org.springframework.stereotype.Service

@Service
class StoreService(val storeRepository: StoreRepository) {
    fun findAllStores(): List<Store> = storeRepository.findAll().toList()

    fun findStoreById(id: Long) = storeRepository.findById(id)

    fun save(store: Store) = storeRepository.save(store)

    fun deleteStoreById(id: Long) = storeRepository.deleteById(id)
}