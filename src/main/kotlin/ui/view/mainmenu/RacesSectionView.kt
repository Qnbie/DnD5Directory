package ui.view.mainmenu

import apicontroller.races.RacesAPI
import apicontroller.races.SubracesAPI
import apicontroller.races.TraitsAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.races.RaceView
import ui.view.races.SubraceView
import ui.view.races.TraitView

@DelicateCoroutinesApi
class RacesSectionView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Races")
        this += sectionButton("Races",fun (){
            GlobalScope.launch {
                val resourceList = RacesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RaceView(resourceList))
                }
            }
        })
        this += sectionButton("Subraces",fun (){
            GlobalScope.launch {
                val resourceList = SubracesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SubraceView(resourceList))
                }
            }
        })
        this += sectionButton("Traites",fun (){
            GlobalScope.launch {
                val resourceList = TraitsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(TraitView(resourceList))
                }
            }
        })
    }
}