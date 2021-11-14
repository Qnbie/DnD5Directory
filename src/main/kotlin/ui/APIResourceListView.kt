package ui

import tornadofx.*

class APIResourceListView(apiResourceList: List<String>, refreshFun: (strgin: String) -> Unit): Fragment() {
    override val root = listview(apiResourceList.asObservable()) {
        cellFormat {
            graphic = cache {
                button (it.toString()) {
                    action {
                        refreshFun(it.toString())
                    }
                }
            }
        }
    }
}