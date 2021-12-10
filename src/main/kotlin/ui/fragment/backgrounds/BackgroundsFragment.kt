package ui.fragment.backgrounds

import apicontroller.characterdata.ProficienciesAPI
import data.backgrounds.Backgrounds
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.fragment.FragmentBase
import ui.fragment.characterdata.ProficiencyFragment

class BackgroundsFragment(backgroundData: Backgrounds): FragmentBase() {
    override val root = vbox{
        this += PageTitle(backgroundData.name)

        this += ResourceList(backgroundData.starting_proficiencies,fun (index: String) {
                runAsync {
                    runBlocking(Dispatchers.Unconfined) {
                        val data = ProficienciesAPI().getProficiency(index)
                        withContext(Dispatchers.JavaFx) {
                            ProficiencyFragment(data).openModal()
                        }
                    }
                }
            }
        )



        backgroundData.feature?.let {
            label(it.name) {  }
            this += Description(it.desc)
        }
    }
}
