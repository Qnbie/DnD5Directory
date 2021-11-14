package ui.equipment

import apicontroller.equipment.WeaponPropertiesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.equipment.WeaponProperty
import ui.ViewBase

class WeaponPropertyView(apiResourceList: APIResourceList) : ViewBase<WeaponPropertiesAPI>(apiResourceList) {
    override val apiController: WeaponPropertiesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getWeaponProperty(index)
    }
}