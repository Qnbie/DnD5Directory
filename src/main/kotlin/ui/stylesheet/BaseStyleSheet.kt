import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.text.FontWeight
import tornadofx.*

class BaseStyleSheet : Stylesheet() {

    companion object {
        val header by cssclass()
        val description by cssclass()
        val dice by cssclass()
        val urlLink by cssclass()
        val listButton by cssclass()
    }

    init {
        header {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }

        listButton {
            backgroundColor += c("#4CAF50")
            borderStyle += BorderStrokeStyle.NONE
            fitToHeight = true
            fitToWidth = true
        }
    }
}