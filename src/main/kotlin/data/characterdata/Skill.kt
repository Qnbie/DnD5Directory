package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Skill : BaseModel() {
    val desc: List<String> = emptyList()
    val abilityScores: List<APIReference> = emptyList()
}