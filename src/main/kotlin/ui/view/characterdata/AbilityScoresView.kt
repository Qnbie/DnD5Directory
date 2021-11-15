package ui.view.characterdata

import apicontroller.characterdata.AbilityScoresAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class AbilityScoresView(apiResourceList: APIResourceList) : ViewBase<AbilityScoresAPI>(apiResourceList) {
    override val apiController: AbilityScoresAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getAbilityScoreByIndex(index)
    }
}