package ui.fragment.races

import data.races.Subrace
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class SubraceFragment(subrace: Subrace): Fragment() {
    override val root = vbox {
        label {
            text(subrace.name)
        }
    }
}