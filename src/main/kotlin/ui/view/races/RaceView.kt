package ui.view.races

import apicontroller.races.RacesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.races.Race
import tornadofx.Fragment
import ui.fragment.races.RaceFragment
import ui.view.ViewBase

class RaceView(apiResourceList: APIResourceList) : ViewBase<RacesAPI>(apiResourceList) {
    override val apiController: RacesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getRace(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return RaceFragment(data as Race)
    }
}