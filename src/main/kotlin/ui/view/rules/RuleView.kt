package ui.view.rules

import apicontroller.rules.RulesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class RuleView(apiResourceList: APIResourceList) : ViewBase<RulesAPI>(apiResourceList) {
    override val apiController: RulesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getRule(index)
    }
}