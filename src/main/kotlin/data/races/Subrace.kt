package data.races

import data.commonmodels.APIReference
import data.commonmodels.AbilityBonus
import data.commonmodels.Choice

class Subrace {
    val race: APIReference = APIReference()
    val desc: String? = null
    val ability_bonuses: List<AbilityBonus>? = null
    val starting_proficiencies: List<APIReference>? = null
    val languages: List<APIReference>? = null
    val language_options: Choice = Choice()
    val racial_traits: List<APIReference>? = null
}