package ui.fragment.characterdata

import data.characterdata.Skill
import tornadofx.*
import ui.fragment.FragmentBase

class SkillFragment(skill: Skill): FragmentBase() {
    override val root = vbox{
        this += PageTitle(skill.name)
        this += Description(skill.desc)
        this += SubTitle("The ability score associated with ${skill.name}.")
        this += ResourceList(skill.abilityScores,fun(index:String){
            //todo
        })
    }
}