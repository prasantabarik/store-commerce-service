package com.tcs.service.repository

import com.tcs.service.model.Store

interface CustomRepository {

    fun getAllByCluster(cluster: Int): List<Store>
}