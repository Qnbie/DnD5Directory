package ui.equipment

import apicontroller.equipment.EquipmentCategoriesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class EquipmentCategoryView(apiResourceList: APIResourceList) : ViewBase<EquipmentCategoriesAPI>(apiResourceList) {
    override val apiController: EquipmentCategoriesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getEquipmentCategory(index)
    }
}