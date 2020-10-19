package com.bb.serializationbenchmark.data

import kotlinx.serialization.Serializable

@Serializable
class Role {
    val title: String? = null
    val slug: String? = null
    val text: Text? = null
    val button: Button? = null
    val textLinkCta: String? = null
    val spanishTextLinkCta: String? = null
    val disclaimerText: String? = null
    val mobileDisclaimerText: String? = null
    val spanishDisclaimerText: String? = null
    val spanishMobileDisclaimerText: String? = null
}