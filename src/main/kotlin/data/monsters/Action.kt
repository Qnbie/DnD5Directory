package data.monsters

import data.commonmodels.APIReference
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Action {
    val name: String? = null
    val desc: String? = null
    val usage: Usage = Usage()
    val dc: Dc = Dc()
    val attack_bonus: Int? = null
    val damage: Damage = Damage()
}

@Serializable
class Dc {
    val dc_type: APIReference = APIReference()
    val dc_value: Int? = null
    val success_type: String? = null
}

@Serializable
class Usage {
    val type: String? = null
    val times: Int? = null
}
