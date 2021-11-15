package ui.fragment.equipment

import data.equipment.Weapon
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class WeaponFragment(weapon: Weapon): Fragment() {
    override val root = vbox {
        label {
            text(weapon.name)
        }
    }
}