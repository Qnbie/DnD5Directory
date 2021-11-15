package ui.view.equipment

import apicontroller.equipment.EquipmentAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.equipment.Weapon
import tornadofx.Fragment
import ui.fragment.equipment.WeaponFragment
import ui.view.ViewBase

class WeaponView(apiResourceList: APIResourceList) : ViewBase<EquipmentAPI>(apiResourceList) {
    override val apiController: EquipmentAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getWeapon(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return WeaponFragment(data as Weapon)
    }
}