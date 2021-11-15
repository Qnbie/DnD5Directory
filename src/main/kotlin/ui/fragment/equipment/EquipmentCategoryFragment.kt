package ui.fragment.equipment

import data.classes.Feature
import data.equipment.EquipmentCategorie
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class EquipmentCategoryFragment(equipmentCategorie: EquipmentCategorie): Fragment() {
    override val root = vbox {
        label(equipmentCategorie.name)
    }
}