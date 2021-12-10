package data.races

import data.characterdata.Language
import data.commonmodels.APIReference
import data.commonmodels.AbilityBonus
import data.commonmodels.BaseModel
import data.commonmodels.Choice

class Subrace: BaseModel() {
    val race: APIReference = APIReference()
    val desc: String? = null
    val ability_bonuses: List<AbilityBonus>? = null
    val starting_proficiencies: List<APIReference>? = null
    val languages: List<APIReference>? = null
    val language_options: Choice<Language> = Choice()
    val racial_traits: List<APIReference>? = null
}