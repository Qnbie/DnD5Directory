package ui.view

import BaseStyleSheet.Companion.listButton
import data.commonmodels.APIReference
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