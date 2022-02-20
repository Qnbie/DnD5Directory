package ui.fragment.characterdata

import apicontroller.characterdata.AbilityScoresAPI
import apicontroller.rules.RuleSectionsAPI
import data.characterdata.Skill
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.fragment.FragmentBase
import ui.fragment.rules.RuleSectionsFragment

class SkillFragment(skill: Skill): FragmentBase() {
    override val root = vbox{
        this += PageTitle(skill.name)
        this += Description(skill.desc)
        this += SubTitle("The ability score associated with ${skill.name}.")
        this += ResourceList(skill.ability_score,fun(index:String){
            GlobalScope.launch(){
                val resourceList = AbilityScoresAPI().getAbilityScoreByIndex(index)
                withContext(Dispatchers.JavaFx){
                    openInternalWindow(AbilityScoresFragment(resourceList))
                }
            }
        })
    }
}