package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
data class Title(
    val shortTitle: String? = null,
    val longTitle: String? = null
)