package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
data class ClassAPIResource (
    val index: String,
    val classs: String,
    val url: String
    )