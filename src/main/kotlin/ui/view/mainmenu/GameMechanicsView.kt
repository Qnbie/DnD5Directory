package ui.view.mainmenu

import apicontroller.gamemechanics.ConditionsAPI
import apicontroller.gamemechanics.DamageTypesAPI
import apicontroller.gamemechanics.MagicSchoolsAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.gamemechanics.ConditionView
import ui.view.gamemechanics.DamageTypeView
import ui.view.gamemechanics.MagicSchoolView

class GameMechanicsView : MainMenuBase() {
    override val root = vbox{
        this += sectionTitle("Game Mechanics")
        this += sectionButton("Conditions",fun (){
            GlobalScope.launch {
                val resourceList = ConditionsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ConditionView(resourceList))
                }
            }
        })
        this += sectionButton("Damage Types",fun (){
            GlobalScope.launch {
                val resourceList = DamageTypesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(DamageTypeView(resourceList))
                }
            }
        })
        this += sectionButton("Magic Schools",fun (){
            GlobalScope.launch {
                val resourceList = MagicSchoolsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MagicSchoolView(resourceList))
                }
            }
        })
    }

}