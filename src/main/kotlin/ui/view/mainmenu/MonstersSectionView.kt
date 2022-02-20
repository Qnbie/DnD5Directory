package ui.view.mainmenu

import apicontroller.monsters.MonstersAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.monster.MonsterView

@DelicateCoroutinesApi
class MonstersSectionView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Monsters")
        this += sectionButton("Monsters",fun (){
            GlobalScope.launch{
                val resourceList = MonstersAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MonsterView(resourceList))
                }
            }
        })
    }
}