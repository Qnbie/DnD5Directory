package ui.fragment.characterdata

import apicontroller.classes.ClassesAPI
import apicontroller.races.RacesAPI
import apicontroller.rules.RuleSectionsAPI
import data.characterdata.Proficiency
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.fragment.FragmentBase
import ui.fragment.classes.ClassFragment
import ui.fragment.races.RaceFragment
import ui.fragment.rules.RuleSectionsFragment

@DelicateCoroutinesApi
class ProficiencyFragment(proficiency: Proficiency): FragmentBase() {
    override val root = vbox{
        this += PageTitle(proficiency.name)
        this += TypeField("Proficency type", proficiency.type)
        this += SubTitle("Classes that start with ${proficiency.name}.")
        this += ResourceList(proficiency.classes, fun(index: String){
            GlobalScope.launch(){
                val resourceList = ClassesAPI().getClass(index)
                withContext(Dispatchers.JavaFx){
                    openInternalWindow(ClassFragment(resourceList))
                }
            }
        })
        this += SubTitle("Races that start with ${proficiency.name}.")
        this += ResourceList(proficiency.races, fun(index: String){
            GlobalScope.launch(){
                val resourceList = RacesAPI().getRace(index)
                withContext(Dispatchers.JavaFx){
                    openInternalWindow(RaceFragment(resourceList))
                }
            }
        })
    }
}