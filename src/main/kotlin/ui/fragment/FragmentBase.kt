package ui.fragment

import BaseStyleSheet.Companion.pageTitle
import BaseStyleSheet.Companion.listButton
import BaseStyleSheet.Companion.subTitle
import data.commonmodels.APIReference
import javafx.scene.control.Label
import javafx.scene.control.ListView
import javafx.scene.layout.VBox
import tornadofx.*

abstract class FragmentBase: Fragment() {

    fun PageTitle(title: String): Label {
        return label(title) {
            addClass(pageTitle)
        }
    }

    fun SubTitle(title: String): Label {
        return label(title) {
            addClass(subTitle)
        }
    }

    fun TypeField(typeName: String, typeValue: String): VBox {
        return vbox {
            label(typeName){
                addClass(subTitle)
            }
            label(typeValue)
        }
    }

    fun Description(descList: List<String>): VBox {
        return vbox {
            for (row in descList){
                this += label {
                    text(row)
                }
            }
        }
    }

    fun ResourceList(resourceList: List<APIReference>, actionFunction:(index: String) -> Unit): ListView<APIReference> {
        return listview(resourceList.asObservable()) {
            cellFormat {
                graphic = cache {
                    button (it.name) {
                        addClass(listButton)
                        action {
                            actionFunction(it.index)
                        }
                    }
                }
            }
        }
    }

}