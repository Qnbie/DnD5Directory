package ui.feats

import apicontroller.feats.FeatsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class FeatView(apiResourceList: APIResourceList) : ViewBase<FeatsAPI>(apiResourceList) {
    override val apiController: FeatsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getFeat(index)
    }
}