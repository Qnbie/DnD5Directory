package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class Choice {
    val choose: Int = 0
    val type: String = ""
    val from: List<APIReference> = emptyList()
    }