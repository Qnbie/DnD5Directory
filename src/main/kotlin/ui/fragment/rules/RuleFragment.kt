package ui.fragment.rules

import apicontroller.characterdata.AbilityScoresAPI
import apicontroller.rules.RuleSectionsAPI
import data.rules.Rule
import data.rules.RuleSections
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.fragment.FragmentBase
import ui.view.characterdata.AbilityScoresView

@DelicateCoroutinesApi
class RuleFragment(rule: Rule): FragmentBase() {
    override val root = vbox {
        this += PageTitle(rule.name)
        this += Description(listOf(rule.desc))
        this += SubTitle("Subsections")
        this += ResourceList(rule.subsections, fun(index:String){
            GlobalScope.launch(){
                val resourceList = RuleSectionsAPI().getRuleSections(index)
                withContext(Dispatchers.JavaFx){
                    openInternalWindow(RuleSectionsFragment(resourceList))
                }
            }
        })
    }
}