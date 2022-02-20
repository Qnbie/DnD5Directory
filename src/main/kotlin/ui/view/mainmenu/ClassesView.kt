package ui.view.mainmenu

import apicontroller.classes.ClassesAPI
import apicontroller.classes.FeaturesAPI
import apicontroller.classes.SubclassesAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.classes.ClassView
import ui.view.classes.FeatureView
import ui.view.classes.SubclassesView

@DelicateCoroutinesApi
class ClassesView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Classe")
        this += sectionButton("Classes",fun (){
            GlobalScope.launch{
                val resourceList = ClassesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(ClassView(resourceList))
                }
            }
        })
        this += sectionButton("Subclasses",fun (){
            GlobalScope.launch{
                val resourceList = SubclassesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(SubclassesView(resourceList))
                }
            }
        })
        this += sectionButton("Features",fun (){
            GlobalScope.launch{
                val resourceList = FeaturesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(FeatureView(resourceList))
                }
            }
        })
    }
}