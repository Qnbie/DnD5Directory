package ui.fragment.backgrounds

import apicontroller.characterdata.ProficienciesAPI
import data.backgrounds.Backgrounds
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.fragment.FragmentBase
import ui.fragment.characterdata.ProficiencyFragment

@DelicateCoroutinesApi
class BackgroundsFragment(backgroundData: Backgrounds): FragmentBase() {
    override val root = vbox{
        this += PageTitle(backgroundData.name)

        this += ResourceList(backgroundData.starting_proficiencies,fun (index: String) {
                runAsync {
                    GlobalScope.launch {
                        val data = ProficienciesAPI().getProficiency(index)
                        withContext(Dispatchers.JavaFx) {
                            openInternalWindow(ProficiencyFragment(data))
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
