package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class Choice<T> {
    val choose: Int? = null
    val type: String? = null
    val from: List<T> = emptyList()
    }