package ui.fragment.equipment

import data.equipment.WeaponProperty
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class WeaponPropertyFragment(weaponProperty: WeaponProperty): Fragment() {
    override val root = vbox {
        label {
            text(weaponProperty.name)
        }
    }
}