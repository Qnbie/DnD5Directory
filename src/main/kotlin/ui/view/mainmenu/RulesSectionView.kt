package ui.view.mainmenu

import apicontroller.rules.RuleSectionsAPI
import apicontroller.rules.RulesAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.rules.RuleSectionsView
import ui.view.rules.RuleView

@DelicateCoroutinesApi
class RulesSectionView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Rules")
        this += sectionButton("Rules",fun (){
            GlobalScope.launch {
                val resourceList = RulesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RuleView(resourceList))
                }
            }
        })
        this += sectionButton("Rule Sections",fun (){
            GlobalScope.launch {
                val resourceList = RuleSectionsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RuleSectionsView(resourceList))
                }
            }
        })
    }
}