package data.races

import data.commonmodels.APIReference
import data.commonmodels.AbilityBonus
import data.commonmodels.BaseModel
import data.commonmodels.Choice
import kotlinx.serialization.Serializable

@Serializable
class Race : BaseModel() {
    val speed: Int = 0
    val ability_bonuses: List<AbilityBonus> = emptyList()
    val alignment: String = ""
    val age: String = ""
    val size: String = ""
    val size_description: String = ""
    val starting_proficiencies: List<APIReference> = emptyList()
    val starting_proficiency_options: Choice = Choice()
    val languages: List<APIReference> = emptyList()
    val language_desc: String = ""
    val traits: List<APIReference> = emptyList()
    val subraces: List<APIReference> = emptyList()
}