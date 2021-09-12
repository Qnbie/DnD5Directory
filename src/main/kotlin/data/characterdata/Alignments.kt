package data.characterdata

import data.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Alignments : BaseModel() {
    val abbreviation: String = ""
    val desc: List<String> = emptyList()
}