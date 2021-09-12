package data.equipment

import data.commonmodels.APIReference
import data.commonmodels.Damage
import kotlinx.serialization.Serializable

@Serializable
class Weapon : EquipmentBase() {
    val weapon_category: String = ""
    val weapon_range: String = ""
    val category_range: String = ""
    val damage: Damage = Damage()
    val two_handed_damage: Damage = Damage()
    val range: Range = Range()
    val properties: List<APIReference> = emptyList()
}

@Serializable
class Range {
    val normal: Int = 0
    val long: Int = 0
}

