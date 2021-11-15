package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
open class BaseModel {
    val index: String = ""
    var name: String = ""
    val url: String? = null
}