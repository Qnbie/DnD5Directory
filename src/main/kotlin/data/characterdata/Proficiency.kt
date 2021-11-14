package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Proficiency : BaseModel() {
    val type: String? = null
    val classes: List<APIReference>? = null
    val races: List<APIReference>? = null
    val reference: List<APIReference>? = null
}