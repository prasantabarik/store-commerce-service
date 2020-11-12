package com.tcs.service.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Store")
data class Store(
    val address: String?,
    val addressCodeEan: Long?,
    val city: String?,
    val cluster: Int?,
    val countryCode: String?,
    val countryName: String?,
    val eslStartDate: String?,
    val eslVendor: String?,
    val formatPeriods: List<FormatPeriod>?,
    @Id
    val id: Int,
    val isFranchise: Boolean?,
    val lifeCycleStatus: String?,
    val name: String,
    val openingTimes: List<OpeningTime>?,
    val phoneNumber: String?,
    val postalCode: String?,
    val region: Int?,
    val storeClusterPeriods: List<StoreClusterPeriod>?,
    val temporaryClosurePeriods: List<TemporaryClosurePeriod>?
)