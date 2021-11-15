import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.text.FontWeight
import tornadofx.*
import java.awt.Color.green
import java.awt.Color.white

class BaseStyleSheet : Stylesheet() {

    companion object {
        val myHeader by cssclass()
        val listButton by cssclass()
    }

    init {
        myHeader {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }

        listButton {
            backgroundColor += c("#4CAF50")
            borderStyle += BorderStrokeStyle.NONE
        }
    }
}