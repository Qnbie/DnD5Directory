package ui.equipment

import apicontroller.equipment.MagicItemsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.equipment.MagicItem
import ui.ViewBase

class MagicItemView(apiResourceList: APIResourceList) : ViewBase<MagicItemsAPI>(apiResourceList) {
    override val apiController: MagicItemsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMagicItem(index)
    }
}