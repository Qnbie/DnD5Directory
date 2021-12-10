package ui.view.backgrounds

import apicontroller.backgrounds.BackgroundsAPI
import data.backgrounds.Backgrounds
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.backgrounds.BackgroundsFragment
import ui.view.ViewBase

class BackgroundsView(apiResourceList: APIResourceList) : ViewBase<BackgroundsAPI>(apiResourceList) {
    override val apiController: BackgroundsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getBackgrounds(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return BackgroundsFragment(data as Backgrounds)
    }
}