package ui.fragment.backgrounds

import BaseStyleSheet.Companion.header
import BaseStyleSheet.Companion.listButton
import data.backgrounds.Backgrounds
import javafx.scene.Parent
import tornadofx.*

class BackgroundsFragment(backgroundData: Backgrounds): Fragment() {
    override val root = vbox{
        label(backgroundData.name) {
            addClass(header)
        }
        listview(backgroundData.starting_proficiencies?.asObservable()) {
            cellFormat {
                graphic = cache {
                    button (it.name) {
                        action {
                            runAsync {
                                // TODO
                            }
                        }
                        addClass(listButton)
                    }
                }
            }
        }
    }
}