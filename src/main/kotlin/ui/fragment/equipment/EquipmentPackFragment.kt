package ui.fragment.equipment

import data.equipment.EquipmentPack
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class EquipmentPackFragment(equipmentPack: EquipmentPack): Fragment() {
    override val root = vbox {
        label {
            text(equipmentPack.name)
        }
    }

}