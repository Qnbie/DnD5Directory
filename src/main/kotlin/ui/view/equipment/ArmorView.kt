package ui.view.equipment

import apicontroller.equipment.EquipmentAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.equipment.Armor
import tornadofx.Fragment
import ui.fragment.equipment.ArmorFragment
import ui.view.ViewBase

class ArmorView(apiResourceList: APIResourceList) : ViewBase<EquipmentAPI>(apiResourceList) {
    override val apiController: EquipmentAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getArmor(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return ArmorFragment(data as Armor)
    }
}