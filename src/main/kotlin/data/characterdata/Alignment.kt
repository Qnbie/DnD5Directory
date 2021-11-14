package data.characterdata

import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Alignment : BaseModel() {
    val abbreviation: String? = null
    val desc: List<String>? = null
}