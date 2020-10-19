package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
class Entry {
    val id: String? = null
    val title: String? = null
    val images: ImageContainer? = null
}