package ui.view.mainmenu

import apicontroller.equipment.EquipmentCategoriesAPI
import apicontroller.equipment.MagicItemsAPI
import apicontroller.equipment.WeaponPropertiesAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.view.equipment.EquipmentCategoryView
import ui.view.equipment.MagicItemView
import ui.view.equipment.WeaponPropertyView

class EquipmentSectionView : MainMenuBase() {
    override val root = vbox {
        this += SectionTitle("Equipment")
        label("TODO")
        this += SectionButton("Magic items",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = MagicItemsAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(MagicItemView(resourceList))
                }
            }
        })
        this += SectionButton("Weapon Properties",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = WeaponPropertiesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(WeaponPropertyView(resourceList))
                }
            }
        })
        this += SectionButton("Equipment Categories",fun (){
            runBlocking (Dispatchers.Unconfined){
                val resourceList = EquipmentCategoriesAPI().getResourceList()
                withContext(Dispatchers.JavaFx){
                    replaceWith(EquipmentCategoryView(resourceList))
                }
            }
        })
    }
}