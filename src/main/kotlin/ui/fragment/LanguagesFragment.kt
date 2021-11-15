package ui.fragment

import BaseStyleSheet.Companion.myHeader
import data.characterdata.Language
import javafx.scene.Node
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.addClass
import tornadofx.hbox
import tornadofx.label

class LanguagesFragment(languageData: Language) : Fragment() {
    override val root = hbox {
        label(languageData.name){
            addClass(myHeader)
        }

        languageData.type?.let { label(it) {  } }
    }
}