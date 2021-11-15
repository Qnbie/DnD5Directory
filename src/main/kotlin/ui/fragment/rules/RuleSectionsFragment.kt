package ui.fragment.rules

import data.rules.RuleSections
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class RuleSectionsFragment(ruleSections: RuleSections): Fragment() {
    override val root = vbox{
        label {
            text(ruleSections.name)
        }
    }
}