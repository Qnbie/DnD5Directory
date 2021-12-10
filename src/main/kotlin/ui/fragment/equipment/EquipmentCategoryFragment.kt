package ui.fragment.equipment

import data.equipment.EquipmentCategorie
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class EquipmentCategoryFragment(equipmentCategorie: EquipmentCategorie): Fragment() {
    override val root = vbox {
        label(equipmentCategorie.name)
    }
}