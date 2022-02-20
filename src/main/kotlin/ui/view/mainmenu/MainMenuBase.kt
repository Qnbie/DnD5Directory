package ui.view.mainmenu

import javafx.scene.control.Button
import javafx.scene.control.Label
import kotlinx.coroutines.*
import tornadofx.*
import ui.stylesheet.MainMenuStyle

@DelicateCoroutinesApi
abstract class MainMenuBase: View() {

    fun sectionTitle(name: String): Label {
        return label(name){
            addClass(MainMenuStyle.sectionTitle)
        }
    }

    fun sectionButton(buttonName: String, buttonFun:() -> Unit): Button {
        return button(buttonName) {
            action {
                runAsync {
                    buttonFun()
                }
            }
        }
    }
}