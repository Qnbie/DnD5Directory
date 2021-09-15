import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

fun main(args: Array<String>) {
    launch<MyApp>(args)
}

class MyApp: App(MyView::class)

class MyView : View() {
    val controller: MyController by inject()

    override val root = vbox {
        label("My items")
        listview(controller.values)
    }
}

class MyController: Controller() {
    val values = FXCollections.observableArrayList("Alpha","Beta","Gamma","Delta")
}