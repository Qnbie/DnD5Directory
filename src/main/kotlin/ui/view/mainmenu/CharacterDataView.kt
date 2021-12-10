package ui.view.mainmenu

import apicontroller.characterdata.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.view.characterdata.*

class CharacterDataView : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Character data")
        this += SectionButton("Ability Scores",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = AbilityScoresAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(AbilityScoresView(resourceList))
                }
            }
        })
        this += SectionButton("Skills",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = SkillsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SkillView(resourceList))
                }
            }
        })
        this += SectionButton("Proficiencies",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = ProficienciesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ProficiencyView(resourceList))
                }
            }
        })
        this += SectionButton("Languages",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = LanguagesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(LanguagesView(resourceList))
                }
            }
        })
        this += SectionButton("Alignments",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = AlignmentsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(AlignmentsView(resourceList))
                }
            }
        })
    }
}