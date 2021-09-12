package data.monsters

import data.commonmodels.APIReference
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Action {
    val name: String = ""
    val desc: String = ""
    val usage: Usage = Usage()
    val dc: Dc = Dc()
    val attack_bonus: Int = 0
    val damage: Damage = Damage()
}

@Serializable
class Dc {
    val dc_type: APIReference = APIReference()
    val dc_value: Int = 0
    val success_type: String = ""
}

@Serializable
class Usage {
    val type: String = ""
    val times: Int = 0
}
