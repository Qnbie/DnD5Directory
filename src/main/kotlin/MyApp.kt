import tornadofx.App
import tornadofx.launch
import ui.MainView

class MyApp: App(MainView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}