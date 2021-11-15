package ui.fragment.characterdata

import data.characterdata.Proficiency
import tornadofx.*
import ui.fragment.FragmentBase

class ProficiencyFragment(proficiency: Proficiency): FragmentBase() {
    override val root = vbox{
        this += PageTitle(proficiency.name)
        this += TypeField("Proficency type", proficiency.type)
        this += SubTitle("Classes that start with ${proficiency.name}.")
        this += ResourceList(proficiency.classes, fun(index: String){
            // todo
        })
        this += SubTitle("Races that start with ${proficiency.name}.")
        this += ResourceList(proficiency.races, fun(index: String){
            // todo
        })
    }
}