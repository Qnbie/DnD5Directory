package ui.view.gamemechanics

import apicontroller.gamemechanics.MagicSchoolsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.gamemechanics.MagicSchool
import tornadofx.Fragment
import ui.fragment.gamemechanics.MagicSchoolFragment
import ui.view.ViewBase

class MagicSchoolView(apiResourceList: APIResourceList) : ViewBase<MagicSchoolsAPI>(apiResourceList) {
    override val apiController: MagicSchoolsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMagicSchool(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return MagicSchoolFragment(data as MagicSchool)
    }
}