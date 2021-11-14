package data.equipment

import data.commonmodels.APIReference
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Weapon : EquipmentBase() {
    val weapon_category: String? = null
    val weapon_range: String? = null
    val category_range: String? = null
    val damage: Damage = Damage()
    val two_handed_damage: Damage = Damage()
    val range: Range = Range()
    val properties: List<APIReference>? = null
}

@Serializable
class Range {
    val normal: Int? = null
    val long: Int? = null
}

