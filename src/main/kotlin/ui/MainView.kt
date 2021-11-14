package ui

import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIResourceList
import javafx.collections.FXCollections
import tornadofx.*
import kotlinx.coroutines.*

class MainView: View() {

    private val controller: MonstersAPI by inject()

    private lateinit var thing: APIResourceList


    override val root = vbox {
        setPrefSize(400.0, 300.0)

        button {
            action {
                runAsync{
                    runBlocking{
                        val job = launch(Dispatchers.IO){
                            thing = controller.getResourceList()
                        }
                        job.join()
                        text = thing.count.toString()
                    }
                }
            }
        }

        label ("thing.count")

        //listview (FXCollections.observableArrayList( controller.getResourceList().results))
    }

}
