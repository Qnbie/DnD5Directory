package ui.fragment.classes

import data.classes.Classes
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class ClassFragment(classes: Classes): Fragment() {
    override val root = vbox {
        label(classes.name)
    }
}