package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class Choice {
    val choose: Int? = null
    val type: String? = null
    val from: List<APIReference>? = null
    }