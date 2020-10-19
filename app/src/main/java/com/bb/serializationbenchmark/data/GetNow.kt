package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
data class GetNow(
    val subTitle: Title? = null,
    val title: Title? = null,
    val button: Button? = null,
    val flag: String? = null
)