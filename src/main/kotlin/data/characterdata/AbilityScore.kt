package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.*

@Serializable
class AbilityScore : BaseModel() {
    val full_name: String = ""
    val desc: List<String> = emptyList()
    val skills: List<APIReference> = emptyList()
}