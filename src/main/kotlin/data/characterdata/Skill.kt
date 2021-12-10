package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Skill : BaseModel() {
    val desc: List<String> = emptyList()
    val ability_score: List<APIReference> = emptyList()
}