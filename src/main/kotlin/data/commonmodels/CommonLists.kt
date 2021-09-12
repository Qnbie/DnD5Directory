package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class CommonLists {
    val count: Int = 0
    val results: List<APIReference> = emptyList()
}