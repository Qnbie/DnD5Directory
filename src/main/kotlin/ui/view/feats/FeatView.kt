package ui.view.feats

import apicontroller.feats.FeatsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.feats.Feat
import tornadofx.Fragment
import ui.fragment.feats.FeatFragment
import ui.view.ViewBase

class FeatView(apiResourceList: APIResourceList) : ViewBase<FeatsAPI>(apiResourceList) {
    override val apiController: FeatsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getFeat(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return FeatFragment(data as Feat)
    }
}