package ui.view.mainmenu

import apicontroller.rules.RuleSectionsAPI
import apicontroller.rules.RulesAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.plusAssign
import tornadofx.vbox
import ui.view.rules.RuleSectionsView
import ui.view.rules.RuleView

class RulesSectionView() : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Rules")
        this += SectionButton("Rules",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = RulesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RuleView(resourceList))
                }
            }
        })
        this += SectionButton("Rule Sections",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = RuleSectionsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RuleSectionsView(resourceList))
                }
            }
        })
    }
}