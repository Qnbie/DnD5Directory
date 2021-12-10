package ui.view.mainmenu

import apicontroller.backgrounds.BackgroundsAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.view.backgrounds.BackgroundsView

class BackgroundsSectionView() : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Backgrounds")
        this += SectionButton("Backgrounds",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = BackgroundsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(BackgroundsView(resourceList))
                }
            }
        })
    }
}