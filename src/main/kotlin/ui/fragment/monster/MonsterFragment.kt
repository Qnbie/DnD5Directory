package ui.fragment.monster

import data.monsters.Monster
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class MonsterFragment(monster: Monster): Fragment() {
    override val root = vbox{
        label {
            text(monster.name)
        }
    }
}