package ui

import tornadofx.App
import tornadofx.launch

class MyApp: App(MainView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}