package ui.fragment.gamemechanics

import data.gamemechanics.DamageType
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class DamageTypeFragment(damageType: DamageType): Fragment() {
    override val root = vbox {
        label {
            text(damageType.name)
        }
    }
}