package data.characterdata

import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Language : BaseModel() {
    val type: String? = null
    val typical_speakers: List<String>? = null
    val script: String? = null
}