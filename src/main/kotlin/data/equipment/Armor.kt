package data.equipment

import kotlinx.serialization.Serializable

@Serializable
class Armor : EquipmentBase() {
    val armor_category: String = ""
    val armor_class: Armor_class = Armor_class()
    val str_minimum: Int = 0
    val stealth_disadvantage: Boolean = false
}

@Serializable
class Armor_class {
    val base: Int = 0
    val dex_bonus: Boolean = false
    val max_bonus: Int = 0
}
