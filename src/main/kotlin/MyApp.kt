
import apicontroller.monsters.MonstersAPI
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.*
import javafx.scene.control.SelectionMode
import javafx.scene.input.MouseEvent
import javafx.scene.layout.BorderPane
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.text.Text
import javafx.stage.Stage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import tornadofx.*

fun main(args: Array<String>) {
    Application.launch(ExampleApp::class.java, *args)
}

class ExampleApp : App() {
    val hello = Text("Hello World!").apply {
        fill = Color.valueOf("#C0C0C0")
    }

    val fab = Circle(20.0, Color.valueOf("#FF4081"))

    val greekLetters = listOf("Alpha","Beta",
        "Gamma","Delta","Epsilon").asObservable()

    val root = BorderPane().apply {
        top = menubar {
            menu("File") {
                menu("Connect") {
                    item("Facebook")
                    item("Twitter")
                }
                item("Save")
                item("Quit")
            }
            menu("Edit") {
                item("Copy")
                item("Paste")
            }
        }

        left = listview(greekLetters) {
            selectionModel.selectionMode = SelectionMode.MULTIPLE
        }

        center = vbox {
            children += hello
            children += fab
        }
    }

    val scene = Scene(root, 240.0, 380.0).apply {
        fill = Color.valueOf("#303030")
    }

    override fun start(stage: Stage) {
        stage.title = "Example"
        stage.scene = scene
        stage.show()
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    prettyPrint = true
                    isLenient = true
                })
            }
        }
        setup(hello, fab, client)
    }
}

fun setup(hello: Text, fab: Circle, client: HttpClient) {
        fab.onClick { // start coroutine when the circle is clicked
            val thin = MonstersAPI(client).getResourceList()
            hello.text = thin.count.toString()
        }
}

fun Node.onClick(action: suspend (MouseEvent) -> Unit) {
    onMouseClicked = EventHandler { event ->
        GlobalScope.launch(Dispatchers.Main) {
            action(event)
        }
    }
}