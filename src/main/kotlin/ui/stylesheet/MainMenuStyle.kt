package ui.stylesheet

import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.text.FontWeight
import tornadofx.*

class MainMenuStyle : Stylesheet() {

    companion object {
        val sectionTitle by cssclass()
        val sectionButton by cssclass()
    }

    init {
        sectionTitle {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }



        sectionButton {
            backgroundColor += c("#4CAF50")
            borderStyle += BorderStrokeStyle.NONE
            fitToHeight = true
            fitToWidth = true
        }
    }
}