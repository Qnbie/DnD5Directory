package ui

import apicontroller.APIControllerBase
import apicontroller.backgrounds.BackgroundsAPI
import apicontroller.characterdata.LanguagesAPI
import apicontroller.monsters.MonstersAPI
import data.monsters.Monster
import tornadofx.*
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import ui.backgrounds.BackgroundsView
import ui.characterdata.LanguagesView
import ui.monster.MonsterView

class MainView: View() {

    private val controller: MonstersAPI by inject()

    private lateinit var thing: Monster

    var monster1 = "Monster1"
    var monster2 = "Monster2"

    override val root = vbox {
        setPrefSize(400.0, 300.0)

            button("Language") {
            action {
                runAsync {
                    runBlocking (Dispatchers.Unconfined){
                        val resourceList = LanguagesAPI().getResourceList()
                        withContext(Dispatchers.JavaFx){
                            replaceWith(LanguagesView(resourceList))
                        }
                    }
                }
            }
        }

        button("Monsters") {
            action {
                runAsync {
                    runBlocking (Dispatchers.Unconfined){
                        val resourceList = MonstersAPI().getResourceList()
                        withContext(Dispatchers.JavaFx){
                            replaceWith(MonsterView(resourceList))
                        }
                    }
                }
            }
        }
    }

}
