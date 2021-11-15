package ui.view.rules

import apicontroller.rules.RuleSectionsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class RuleSectionsView(apiResourceList: APIResourceList) : ViewBase<RuleSectionsAPI>(apiResourceList) {
    override val apiController: RuleSectionsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getRuleSections(index)
    }
}