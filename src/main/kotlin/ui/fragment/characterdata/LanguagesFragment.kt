package ui.fragment.characterdata

import data.characterdata.Language
import tornadofx.*
import ui.fragment.FragmentBase

class LanguagesFragment(languageData: Language) : FragmentBase() {
    override val root = vbox {
        this += PageTitle(languageData.name)
        label("LanguageType: ${languageData.type}")

        label("Typical speaker")

        for (speker in languageData.typical_speakers){
            label(speker)
        }

        languageData.script?.let{
            label("Script: $it")
        }

        languageData.desc?.let {
            this += Description(listOf(it))
        }

    }
}