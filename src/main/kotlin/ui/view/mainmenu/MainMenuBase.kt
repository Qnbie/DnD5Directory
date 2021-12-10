package ui.view.mainmenu

import javafx.scene.control.Button
import javafx.scene.control.Label
import tornadofx.*
import ui.stylesheet.MainMenuStyle

abstract class MainMenuBase() : View(){

    fun SectionTitle(name: String): Label {
        return label(name){
            addClass(MainMenuStyle.sectionTitle)
        }
    }

    fun SectionButton(buttonName: String, buttonFun:() -> Unit): Button {
        return button(buttonName) {
            action {
                runAsync {
                    buttonFun()
                }
            }
        }
    }
}