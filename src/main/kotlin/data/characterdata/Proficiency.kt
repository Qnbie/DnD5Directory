package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Proficiency : BaseModel() {
    val type: String = ""
    val classes: List<APIReference> = emptyList()
    val races: List<APIReference> = emptyList()
    val reference: List<APIReference> = emptyList()
}