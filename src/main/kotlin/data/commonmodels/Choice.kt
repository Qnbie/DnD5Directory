package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
data class Choice (
    val choose: Int,
    val type: String,
    val from: List<APIReference>
    )