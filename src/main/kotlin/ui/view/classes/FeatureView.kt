package ui.view.classes

import apicontroller.classes.FeaturesAPI
import data.classes.Feature
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.classes.FeatureFragment
import ui.view.ViewBase

class FeatureView(apiResourceList: APIResourceList) : ViewBase<FeaturesAPI>(apiResourceList) {
    override val apiController: FeaturesAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getFeature(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return FeatureFragment(data as Feature)
    }
}