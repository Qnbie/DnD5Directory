package ui.fragment.equipment

import data.equipment.Armor
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class ArmorFragment(armor: Armor): Fragment() {
    override val root = vbox{
        label(armor.name)
    }
}