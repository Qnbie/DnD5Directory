package ui.fragment.classes

import data.classes.Subclass
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class SubclassesFragment(subclass: Subclass): Fragment() {
    override val root = vbox{
        label(subclass.name)
    }
}