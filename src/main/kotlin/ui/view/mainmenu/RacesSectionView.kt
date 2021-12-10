package ui.view.mainmenu

import apicontroller.races.RacesAPI
import apicontroller.races.SubracesAPI
import apicontroller.races.TraitsAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.plusAssign
import tornadofx.vbox
import ui.view.races.RaceView
import ui.view.races.SubraceView
import ui.view.races.TraitView

class RacesSectionView() : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Races")
        this += SectionButton("Races",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = RacesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(RaceView(resourceList))
                }
            }
        })
        this += SectionButton("Subraces",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = SubracesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SubraceView(resourceList))
                }
            }
        })
        this += SectionButton("Traites",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = TraitsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(TraitView(resourceList))
                }
            }
        })
    }
}