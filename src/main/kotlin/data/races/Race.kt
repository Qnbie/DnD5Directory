package data.races

import data.characterdata.Proficiency
import data.commonmodels.APIReference
import data.commonmodels.AbilityBonus
import data.commonmodels.BaseModel
import data.commonmodels.Choice
import kotlinx.serialization.Serializable

@Serializable
class Race : BaseModel() {
    val speed: Int? = null
    val ability_bonuses: List<AbilityBonus>? = null
    val alignment: String? = null
    val age: String? = null
    val size: String? = null
    val size_description: String? = null
    val starting_proficiencies: List<APIReference>? = null
    val starting_proficiency_options: Choice<Proficiency> = Choice()
    val languages: List<APIReference>? = null
    val language_desc: String? = null
    val traits: List<APIReference>? = null
    val subraces: List<APIReference>? = null
}