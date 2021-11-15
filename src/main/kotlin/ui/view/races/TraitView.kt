package ui.view.races

import apicontroller.races.TraitsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.races.Trait
import tornadofx.Fragment
import ui.fragment.races.TraitFragment
import ui.view.ViewBase

class TraitView(apiResourceList: APIResourceList) : ViewBase<TraitsAPI>(apiResourceList) {
    override val apiController: TraitsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getTrait(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return TraitFragment(data as Trait)
    }
}