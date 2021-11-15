package ui.fragment.gamemechanics

import data.gamemechanics.Condition
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class ConditionFragment(condition: Condition): Fragment() {
    override val root = vbox {
        label {
            text(condition.name)
        }
    }
}