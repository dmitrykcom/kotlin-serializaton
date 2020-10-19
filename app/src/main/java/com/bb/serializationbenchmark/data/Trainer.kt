package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
class Trainer {
    val slug: String? = null
    val title: String? = null
    val trainerType: String? = null
    val description: Description? = null
}