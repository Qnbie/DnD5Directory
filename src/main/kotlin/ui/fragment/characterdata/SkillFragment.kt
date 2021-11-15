package ui.fragment.characterdata

import data.characterdata.Skill
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class SkillFragment(skill: Skill): Fragment() {
    override val root = vbox{
        label(skill.name)
    }
}