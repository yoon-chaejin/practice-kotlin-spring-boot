package com.heeheepresso.menu.domain.store.repository

import com.heeheepresso.menu.domain.store.model.Store
import org.springframework.data.repository.CrudRepository

interface StoreRepository : CrudRepository<Store, Long>