package com.tcs.service.repository

import com.tcs.service.model.Store
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Repository

@Repository
class CustomRepositoryImpl(private val mongoTemplate: MongoTemplate) : CustomRepository{


    override fun getAllByCluster(cluster: Int): List<Store>{
        return mongoTemplate.find(Query(Criteria.where("cluster").`is`(cluster)),
        Store::class.java)
    }
}