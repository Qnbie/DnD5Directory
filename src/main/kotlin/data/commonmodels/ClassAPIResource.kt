package data.commonmodels

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class ClassAPIResource {
    val index: String = ""
    @SerialName("class") val classAPi: String = ""
    val url: String = ""
}