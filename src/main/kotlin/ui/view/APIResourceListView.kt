package ui.view

import BaseStyleSheet.Companion.listButton
import apicontroller.equipment.WeaponPropertiesAPI
import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIReference
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*

class APIResourceListView(apiResourceList: List<APIReference>?, refreshFun: (strgin: String) -> Unit): Fragment() {
    override val root = listview(apiResourceList?.asObservable()) {
        cellFormat {
            graphic = cache {
                button (it.name) {
                    action {
                        runAsync {
                            refreshFun(it.index)
                        }
                    }
                    addClass(listButton)
                }
            }
        }
    }
}