package ui.fragment.spells

import data.spells.Spell
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class SpellFragment(spell: Spell): Fragment() {
    override val root = vbox {
        label {
            text(spell.name)
        }
    }
}