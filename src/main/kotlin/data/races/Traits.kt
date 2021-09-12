package data.races

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import data.commonmodels.Choice
import kotlinx.serialization.Serializable

@Serializable
class Traits : BaseModel() {
    val races: List<APIReference> = emptyList()
    val subraces: List<APIReference> = emptyList()
    val desc: List<String> = emptyList()
    val proficiencies: List<APIReference> = emptyList()
    val proficiency_choices: Choice = Choice()
    // TODO trait_specific
}