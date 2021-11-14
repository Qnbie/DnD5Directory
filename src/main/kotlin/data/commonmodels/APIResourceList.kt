package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class APIResourceList {
    val count: Int? = null
    val results: List<APIReference>? = null
}