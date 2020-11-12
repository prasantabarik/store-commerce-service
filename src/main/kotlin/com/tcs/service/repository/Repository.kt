package com.tcs.service.repository

import com.tcs.service.model.Store
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface Repository : MongoRepository<Store, Int>, CustomRepository {

}
