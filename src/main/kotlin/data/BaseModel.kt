package data

import kotlinx.serialization.Serializable

@Serializable
open class BaseModel {
    val index: String = ""
    val name: String = ""
    val url: String = ""
}