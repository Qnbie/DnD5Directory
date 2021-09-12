package data.characterdata

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Skills : BaseModel() {
    val desc: List<String> = emptyList()
    val abilityScores: List<APIReference> = emptyList()
}