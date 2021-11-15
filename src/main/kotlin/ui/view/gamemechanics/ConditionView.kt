package ui.view.gamemechanics

import apicontroller.gamemechanics.ConditionsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class ConditionView(apiResourceList: APIResourceList) : ViewBase<ConditionsAPI>(apiResourceList) {
    override val apiController: ConditionsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getCondition(index)
    }
}