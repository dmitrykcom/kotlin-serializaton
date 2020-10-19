package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
data class Button(
    val text: String? = null,
    val href: String? = null
)