import tornadofx.App
import tornadofx.launch
import ui.MainMenu

class MyApp: App(MainMenu::class, BaseStyleSheet::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}