package data.characterdata

import data.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Languages : BaseModel() {
    val type: String = ""
    val typical_speakers: List<String> = emptyList()
    val script: String = ""
}