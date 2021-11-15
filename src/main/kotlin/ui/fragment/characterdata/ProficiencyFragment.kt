package ui.fragment.characterdata

import data.characterdata.Proficiency
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class ProficiencyFragment(proficiency: Proficiency): Fragment() {
    override val root = vbox{
        label(proficiency.name)
    }
}