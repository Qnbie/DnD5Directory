package data.monsters

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Monster : BaseModel() {
    val size: String? = null
    val type: String? = null
    val subtype: String? = null
    val alignment: String? = null
    val armor_class: Int? = null
    val hit_points: Int? = null
    val hit_dice: String? = null
    val forms: APIReference = APIReference()
    val speed: Speed = Speed()
    val strength: Int? = null
    val dexterity: Int? = null
    val constitution: Int? = null
    val intelligence: Int? = null
    val wisdom: Int? = null
    val charisma: Int? = null
    val proficiencies: List<Proficienci>? = null
    val damage_vulnerabilities: List<String>? = null
    val damage_resistances: List<String>? = null
    val damage_immunities: List<String>? = null
    val condition_immunities: List<String>? = null
    val senses: Senses = Senses()
    val languages: String? = null
    val challenge_rating: Int? = null
    val special_abilities: List<Action>? = null
    val actions: List<Action>? = null
    val legendary_actions: List<Action>? = null
}

@Serializable
class Proficienci {
    @SerialName("value") val valueAPI: Int = 6
    val proficiency: APIReference = APIReference()
}

@Serializable
class Senses {
    val darkvision: String? = null
    val passive_perception: Int? = null
}

@Serializable
class Speed {
    val walk: String? = null
    val swim: String? = null
}
