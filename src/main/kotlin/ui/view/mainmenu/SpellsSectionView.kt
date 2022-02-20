package ui.view.mainmenu

import apicontroller.spells.SpellsAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.spells.SpellView

@DelicateCoroutinesApi
class SpellsSectionView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Spells")
        this += sectionButton("Spells",fun (){
            GlobalScope.launch {
                val resourceList = SpellsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SpellView(resourceList))
                }
            }
        })
    }
}