package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
data class Description(val raw: String? = null,
                       val rendered: String? = null)