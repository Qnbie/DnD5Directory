package ui.view.mainmenu

import apicontroller.equipment.EquipmentCategoriesAPI
import apicontroller.equipment.MagicItemsAPI
import apicontroller.equipment.WeaponPropertiesAPI
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import ui.view.equipment.EquipmentCategoryView
import ui.view.equipment.MagicItemView
import ui.view.equipment.WeaponPropertyView

@DelicateCoroutinesApi
class EquipmentSectionView : MainMenuBase() {
    override val root = vbox {
        this += sectionTitle("Equipment")
        label("TODO")
        this += sectionButton("Magic items",fun (){
            GlobalScope.launch{
                val resourceList = MagicItemsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MagicItemView(resourceList))
                }
            }
        })
        this += sectionButton("Weapon Properties",fun (){
            GlobalScope.launch{
                val resourceList = WeaponPropertiesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(WeaponPropertyView(resourceList))
                }
            }
        })
        this += sectionButton("Equipment Categories",fun (){
            GlobalScope.launch{
                val resourceList = EquipmentCategoriesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(EquipmentCategoryView(resourceList))
                }
            }
        })
    }
}