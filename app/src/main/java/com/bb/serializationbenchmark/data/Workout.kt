package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
class Workout {
    val guid: String? = null
    val slug: String? = null
    val title: String? = null
    val description: Description? = null
    val programTitle: String? = null
    val brandCode: String? = null
    val displayAttribute: String? = null
    val kitType: String? = null
    val trainers: List<Trainer> = ArrayList()
    val workoutLevels: List<String> = ArrayList()
    val workoutTypes: List<String> = ArrayList()
    val marketingTime: Int? = null
    val releaseDate: String? = null
    val pubDate: String? = null
    val sunrise: String? = null
    val sunset: String? = null
    val groupName: String? = null
    val images: WorkoutImages? = null
    val resources: List<Resource> = ArrayList()
    val recommendEquips: List<String> = ArrayList()
    val requiredEquips: List<String> = ArrayList()
    val isModifier: Boolean? = null
    val typeOfExercise: String? = null
    val relatedVideos: String? = null
    val platform: List<String> = ArrayList()
    val purchaseRegion: List<String> = ArrayList()
}