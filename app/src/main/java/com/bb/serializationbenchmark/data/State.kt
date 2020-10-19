package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
class State {
    val slug: String? = null
    val title: String? = null
    val roles: List<Role> = ArrayList()
}