package ui.characterdata

import apicontroller.characterdata.ProficienciesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class ProficiencyView(apiResourceList: APIResourceList) : ViewBase<ProficienciesAPI>(apiResourceList) {
    override val apiController: ProficienciesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getProficiency(index)
    }
}