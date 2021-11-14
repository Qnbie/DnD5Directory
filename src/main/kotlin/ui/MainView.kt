package ui

import apicontroller.monsters.MonstersAPI
import data.monsters.Monster
import tornadofx.*
import kotlinx.coroutines.*
import ui.monster.MonsterView

class MainView: View() {

    private val controller: MonstersAPI by inject()

    private lateinit var thing: Monster

    var monster1 = "Monster1"
    var monster2 = "Monster2"

    override val root = vbox {
        setPrefSize(400.0, 300.0)

        button {
            action {
                runBlocking{
                        val job = launch(Dispatchers.IO){
                            thing = controller.getMonster("0")
                        }
                        job.join()

                    }
            }
        }


        this += MonsterView()
    }

}
