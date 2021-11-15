package ui.view.equipment

import apicontroller.equipment.EquipmentAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.equipment.EquipmentPack
import tornadofx.Fragment
import ui.fragment.equipment.EquipmentPackFragment
import ui.view.ViewBase

class EquipmentPackView(apiResourceList: APIResourceList) : ViewBase<EquipmentAPI>(apiResourceList) {
    override val apiController: EquipmentAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getEquipmentPack(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return EquipmentPackFragment(data as EquipmentPack)
    }
}