package data.characterdata

import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Language : BaseModel() {
    val type: String = ""
    val typical_speakers: List<String> = emptyList()
    val script: String? = null
    val desc: String? = null
}