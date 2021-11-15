package ui.fragment.rules

import data.rules.Rule
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class RuleFragment(rule: Rule): Fragment() {
    override val root = vbox {
        label {
            text(rule.name)
        }
    }
}