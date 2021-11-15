package ui.view.races

import apicontroller.races.SubracesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.races.Subrace
import tornadofx.Fragment
import ui.fragment.races.SubraceFragment
import ui.view.ViewBase

class SubraceView(apiResourceList: APIResourceList) : ViewBase<SubracesAPI>(apiResourceList) {
    override val apiController: SubracesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSubrace(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return SubraceFragment(data as Subrace)
    }
}