package data.characterdata

import data.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Proficiencies : BaseModel() {
    val type: String = ""
    val classes: List<APIReference> = emptyList()
    val races: List<APIReference> = emptyList()
    val reference: List<APIReference> = emptyList()
}