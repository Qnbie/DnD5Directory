package ui.view.backgrounds

import apicontroller.backgrounds.BackgroundsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class BackgroundsView(apiResourceList: APIResourceList) : ViewBase<BackgroundsAPI>(apiResourceList) {
    override val apiController: BackgroundsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getBackgrounds(index)
    }
}