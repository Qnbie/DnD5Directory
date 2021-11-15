package ui.fragment.characterdata

import BaseStyleSheet.Companion.header
import data.characterdata.Language
import tornadofx.Fragment
import tornadofx.addClass
import tornadofx.hbox
import tornadofx.label

class LanguagesFragment(languageData: Language) : Fragment() {
    override val root = hbox {
        label(languageData.name){
            addClass(header)
        }

        languageData.type?.let { label(it) {  } }
    }
}