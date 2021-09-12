package data.monsters

import data.characterdata.Proficiencies
import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Monster : BaseModel() {
    val size: String = ""
    val type: String = ""
    val subtype: String = ""
    val alignment: String = ""
    val armor_class: Int = 0
    val hit_points: Int = 0
    val hit_dice: String = ""
    val forms: APIReference = APIReference()
    val speed: Speed = Speed()
    val strength: Int = 0
    val dexterity: Int = 0
    val constitution: Int = 0
    val intelligence: Int = 0
    val wisdom: Int = 0
    val charisma: Int = 0
    val proficiencies: List<Proficienci> = emptyList()
    val damage_vulnerabilities: List<String> = emptyList()
    val damage_resistances: List<String> = emptyList()
    val damage_immunities: List<String> = emptyList()
    val condition_immunities: List<String> = emptyList()
    val senses: Senses = Senses()
    val languages: String = ""
    val challenge_rating: Int = 0
    val special_abilities: List<Action> = emptyList()
    val actions: List<Action> = emptyList()
    val legendary_actions: List<Action> = emptyList()
}

@Serializable
class Proficienci {
    @SerialName("value") val valueAPI: Int = 6
    val proficiency: APIReference = APIReference()
}

@Serializable
class Senses {
    val darkvision: String = ""
    val passive_perception: Int = 0
}

@Serializable
class Speed {
    val walk: String = ""
    val swim: String = ""
}
