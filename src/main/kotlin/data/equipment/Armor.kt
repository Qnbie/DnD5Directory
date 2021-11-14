package data.equipment

import kotlinx.serialization.Serializable

@Serializable
class Armor : EquipmentBase() {
    val armor_category: String? = null
    val armor_class: ArmorClass = ArmorClass()
    val str_minimum: Int? = null
    val stealth_disadvantage: Boolean = false
}

@Serializable
class ArmorClass {
    val base: Int? = null
    val dex_bonus: Boolean = false
    val max_bonus: Int? = null
}
