package ui.view.mainmenu

import apicontroller.feats.FeatsAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.plusAssign
import tornadofx.vbox
import ui.view.feats.FeatView

class FeatsSectionView() : MainMenuBase() {
    override val root = vbox{
        this += SectionTitle("Feats")
        this += SectionButton("Feats",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = FeatsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(FeatView(resourceList))
                }
            }
        })
    }
}