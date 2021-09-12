package data.spells

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Spell : BaseModel() {
    val desc: List<String> = emptyList()
    val higher_level: List<String> = emptyList()
    val range: String = ""
    val components: List<String> = emptyList()
    val material: String = ""
    val ritual: Boolean = false
    val duration: String = ""
    val concentration: Boolean = false
    val casting_time: String = ""
    val level: Int = 0
    val attack_type: String = ""
    val damage: Damage = Damage()
    val school: APIReference = APIReference()
    val classes: APIReference = APIReference()
    val subclasses: List<APIReference> = emptyList()
}