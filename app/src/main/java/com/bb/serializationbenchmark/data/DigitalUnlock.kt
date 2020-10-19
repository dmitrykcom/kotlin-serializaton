package com.bb.serializationbenchmark.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class DigitalUnlock {
    val message: String? = null

    @SerializedName("sneak_peak_guid")
    val sneakPeakGuid: String? = null

    @SerializedName("message_mobile")
    val messageMobile: String? = null

    @SerializedName("available_digital_unlock")
    val availableDigitalUnlock: String? = null

    @SerializedName("sizzle_guid")
    val sizzleGuid: String? = null
}