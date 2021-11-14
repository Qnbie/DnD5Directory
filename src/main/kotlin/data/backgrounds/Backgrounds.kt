package data.backgrounds

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import data.commonmodels.Choice
import kotlinx.serialization.Serializable

@Serializable
class Backgrounds : BaseModel() {
    val starting_proficiencies: List<APIReference>? = null
    val language_options: Choice = Choice()
    val starting_equipment: List<APIReference>? = null
    val starting_equipment_options: List<Choice>? = null
    val feature: BackgroundFeature = BackgroundFeature()
    val personality_traits: Choice = Choice()
    val ideals: Choice = Choice()
    val bonds: Choice = Choice()
    val flaws: Choice = Choice()
}