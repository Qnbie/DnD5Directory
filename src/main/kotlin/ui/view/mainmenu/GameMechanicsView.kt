package ui.view.mainmenu

import apicontroller.gamemechanics.ConditionsAPI
import apicontroller.gamemechanics.DamageTypesAPI
import apicontroller.gamemechanics.MagicSchoolsAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.view.gamemechanics.ConditionView
import ui.view.gamemechanics.DamageTypeView
import ui.view.gamemechanics.MagicSchoolView

class GameMechanicsView : MainMenuBase() {
    override val root = vbox{
        this += SectionTitle("Game Mechanics")
        this += SectionButton("Conditions",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = ConditionsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ConditionView(resourceList))
                }
            }
        })
        this += SectionButton("Damage Types",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = DamageTypesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(DamageTypeView(resourceList))
                }
            }
        })
        this += SectionButton("Magic Schools",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = MagicSchoolsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MagicSchoolView(resourceList))
                }
            }
        })
    }

}