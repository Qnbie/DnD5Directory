package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Skill : BaseModel() {
    val desc: List<String>? = null
    val abilityScores: List<APIReference>? = null
}