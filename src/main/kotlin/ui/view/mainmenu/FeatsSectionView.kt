package ui.view.mainmenu

import apicontroller.feats.FeatsAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.feats.FeatView

@DelicateCoroutinesApi
class FeatsSectionView : MainMenuBase() {
    override val root = vbox{
        this += sectionTitle("Feats")
        this += sectionButton("Feats",fun (){
            GlobalScope.launch{
                val resourceList = FeatsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(FeatView(resourceList))
                }
            }
        })
    }
}