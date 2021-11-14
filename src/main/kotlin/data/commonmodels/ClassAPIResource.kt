package data.commonmodels

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class ClassAPIResource {
    val index: String? = null
    @SerialName("class") val classAPi: String? = null
    val url: String? = null
}