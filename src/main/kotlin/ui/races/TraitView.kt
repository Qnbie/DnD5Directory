package ui.races

import apicontroller.races.TraitsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.races.Trait
import ui.ViewBase

class TraitView(apiResourceList: APIResourceList) : ViewBase<TraitsAPI>(apiResourceList) {
    override val apiController: TraitsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getTrait(index)
    }
}