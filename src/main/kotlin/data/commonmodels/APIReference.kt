package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
data class APIReference(
    val index: String,
    val name: String,
    val url: String
)
