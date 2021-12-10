package ui.view.mainmenu

import apicontroller.spells.SpellsAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.view.spells.SpellView

class SpellsSectionView : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Spells")
        this += SectionButton("Spells",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = SpellsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SpellView(resourceList))
                }
            }
        })
    }
}