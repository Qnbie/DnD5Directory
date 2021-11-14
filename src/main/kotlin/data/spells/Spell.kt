package data.spells

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Spell : BaseModel() {
    val desc: List<String>? = null
    val higher_level: List<String>? = null
    val range: String? = null
    val components: List<String>? = null
    val material: String? = null
    val ritual: Boolean = false
    val duration: String? = null
    val concentration: Boolean = false
    val casting_time: String? = null
    val level: Int? = null
    val attack_type: String? = null
    val damage: Damage = Damage()
    val school: APIReference = APIReference()
    val classes: APIReference = APIReference()
    val subclasses: List<APIReference>? = null
}