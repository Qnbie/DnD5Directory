package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
open class BaseModel {
    val index: String? = null
    val name: String? = null
    val url: String? = null
}