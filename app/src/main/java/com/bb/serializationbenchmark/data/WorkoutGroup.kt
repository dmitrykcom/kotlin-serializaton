package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
class WorkoutGroup {
    val groupName: String? = null
    val groupSeq: Int? = null
    val description: String? = null
    val workouts: List<Workout> = ArrayList()
}