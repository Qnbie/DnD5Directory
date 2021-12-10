package ui.fragment.races

import data.races.Trait
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class TraitFragment(trait: Trait) : Fragment() {
    override val root = vbox {
        label {
            text(trait.name)
        }
    }
}