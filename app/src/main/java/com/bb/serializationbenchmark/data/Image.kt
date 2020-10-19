package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
class Image {
    val url: String? = null
    val sourceUrl: String? = null
    val file // name
            : String? = null
    val width: String? = null
    val height: String? = null
    val mimeType: String? = null
}