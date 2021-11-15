package ui.fragment.gamemechanics

import data.gamemechanics.MagicSchool
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class MagicSchoolFragment(magicSchool: MagicSchool): Fragment() {
    override val root = vbox{
        label {
            text(magicSchool.name)
        }
    }
}