package ui.view.mainmenu

import apicontroller.classes.ClassesAPI
import apicontroller.classes.FeaturesAPI
import apicontroller.classes.SubclassesAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.plusAssign
import tornadofx.vbox
import ui.view.classes.ClassView
import ui.view.classes.FeatureView
import ui.view.classes.SubclassesView

class ClassesView() : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Classe")
        this += SectionButton("Classes",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = ClassesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ClassView(resourceList))
                }
            }
        })
        this += SectionButton("Subclasses",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = SubclassesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SubclassesView(resourceList))
                }
            }
        })
        this += SectionButton("Features",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = FeaturesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(FeatureView(resourceList))
                }
            }
        })
    }
}