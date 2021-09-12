package data.races

import data.commonmodels.APIReference
import data.commonmodels.AbilityBonus
import data.commonmodels.Choice

class Subraces {
    val race: APIReference = APIReference()
    val desc: String = ""
    val ability_bonuses: List<AbilityBonus> = emptyList()
    val starting_proficiencies: List<APIReference> = emptyList()
    val languages: List<APIReference> = emptyList()
    val language_options: Choice = Choice()
    val racial_traits: List<APIReference> = emptyList()
}