package data.backgrounds

import data.characterdata.Language
import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import data.commonmodels.Choice
import data.races.Trait
import kotlinx.serialization.Serializable

@Serializable
class Backgrounds : BaseModel() {
    val starting_proficiencies: List<APIReference> = emptyList()
    val language_options: Choice<Language> = Choice()
    val starting_equipment: List<StartingEquipment> = emptyList()
    val feature: BackgroundFeature? = BackgroundFeature()
    val personality_traits: Choice<Trait> = Choice()
    val ideals: Choice<Ideal> = Choice()
    val bonds: Choice<String> = Choice()
    val flaws: Choice<String> = Choice()
}

@Serializable
class Ideal {
    val desc : String = ""
    val alignments : List<APIReference> = emptyList()
}

@Serializable
class StartingEquipment{
    val equipment: APIReference = APIReference()
    val quantity: Int = 0
}