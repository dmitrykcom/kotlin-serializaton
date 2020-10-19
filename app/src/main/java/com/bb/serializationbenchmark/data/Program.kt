package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
class Program {
    val brandCode: String? = null
    val title: String? = null
    val slug: String? = null
    val entitlement: String? = null
    val category: String? = null
    val enrollment: String? = null
    val getNow: GetNow? = null
    val videoCount: Int? = null
    val expert: Expert? = null
    val longDescription: Description? = null
    val shortDescription: Description? = null
    val nutritionDescription: Description? = null
    val heroDescriptionCopy: String? = null
    val heroCtaButtonCopy: String? = null
    val heroCtaUrlLnk: String? = null
    val heroTextColor: String? = null
    val duDevices: String? = null
    val isPseudo: Boolean? = null
    val digitalUnlock: DigitalUnlock? = null
    val programIntensity: Entry? = null
    val trainers: List<Trainer> = ArrayList()
    val programDurationType: String? = null
    val programDuration: Entry? = null
    val workoutDurationMinimum: Entry? = null
    val workoutDurationMaximum: Entry? = null
    val workoutType: List<Entry> = ArrayList()
    val programState: String? = null
    val state: State? = null
    val releaseStatus: String? = null
    val images: ProgramImages? = null
    val promo: List<TitleAndSlug> = ArrayList()
    val social: List<TitleAndSlug> = ArrayList()
    val successStory: List<TitleAndSlug> = ArrayList()
    val entitlementGroup: List<TitleAndSlug> = ArrayList()
    val startDate: String? = null
    val sortOrder: String? = null
    val platform: List<String> = ArrayList()
    val purchaseRegion: List<String> = ArrayList()
    val workoutGroupNum: Int? = null
    val workoutTotalNum: Int? = null
    val workoutGroups: List<WorkoutGroup> = ArrayList()
}