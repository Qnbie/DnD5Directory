package ui.view.mainmenu

import apicontroller.backgrounds.BackgroundsAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.backgrounds.BackgroundsView

class BackgroundsSectionView : MainMenuBase() {
    @DelicateCoroutinesApi
    override val root = vbox {
        this += sectionTitle("Backgrounds")
        this += sectionButton("Backgrounds",fun (){
            GlobalScope.launch(){
                val resourceList = BackgroundsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(BackgroundsView(resourceList))
                }
            }
        })
    }
}