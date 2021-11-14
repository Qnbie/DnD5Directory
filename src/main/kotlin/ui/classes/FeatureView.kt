package ui.classes

import apicontroller.classes.FeaturesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class FeatureView(apiResourceList: APIResourceList) : ViewBase<FeaturesAPI>(apiResourceList) {
    override val apiController: FeaturesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getFeature(index)
    }
}