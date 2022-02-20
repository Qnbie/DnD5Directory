package ui.view.mainmenu

import apicontroller.characterdata.*
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.characterdata.*

@DelicateCoroutinesApi
class CharacterDataView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Character data")
        this += sectionButton("Ability Scores",fun (){
            GlobalScope.launch(){
                val resourceList = AbilityScoresAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(AbilityScoresView(resourceList))
                }
            }
        })
        this += sectionButton("Skills",fun (){
            GlobalScope.launch(){
                val resourceList = SkillsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SkillView(resourceList))
                }
            }
        })
        this += sectionButton("Proficiencies",fun (){
            GlobalScope.launch(){
                val resourceList = ProficienciesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ProficiencyView(resourceList))
                }
            }
        })
        this += sectionButton("Languages",fun (){
            GlobalScope.launch(){
                val resourceList = LanguagesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(LanguagesView(resourceList))
                }
            }
        })
        this += sectionButton("Alignments",fun (){
            GlobalScope.launch(){
                val resourceList = AlignmentsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(AlignmentsView(resourceList))
                }
            }
        })
    }
}