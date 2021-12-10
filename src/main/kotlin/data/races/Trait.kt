package data.races

import data.characterdata.Proficiency
import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import data.commonmodels.Choice
import kotlinx.serialization.Serializable

@Serializable
class Trait : BaseModel() {
    val races: List<APIReference>? = null
    val subraces: List<APIReference>? = null
    val desc: List<String>? = null
    val proficiencies: List<APIReference>? = null
    val proficiency_choices: Choice<Proficiency> = Choice()
    // TODO trait_specific
}