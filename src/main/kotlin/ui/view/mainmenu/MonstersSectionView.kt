package ui.view.mainmenu

import apicontroller.monsters.MonstersAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.plusAssign
import tornadofx.vbox
import ui.view.monster.MonsterView

class MonstersSectionView() : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Monsters")
        this += SectionButton("Monsters",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = MonstersAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MonsterView(resourceList))
                }
            }
        })
    }
}