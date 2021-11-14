package ui

import apicontroller.equipment.WeaponPropertiesAPI
import apicontroller.monsters.MonstersAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*

class APIResourceListView(apiResourceList: List<String>, refreshFun: (strgin: String) -> Unit): Fragment() {
    override val root = listview(apiResourceList.asObservable()) {
        cellFormat {
            graphic = cache {
                button (it.toString()) {
                    action {
                        runAsync {
                            refreshFun(it)
                        }
                    }
                }
            }
        }
    }
}