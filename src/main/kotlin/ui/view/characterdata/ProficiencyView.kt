package ui.view.characterdata

import apicontroller.characterdata.ProficienciesAPI
import data.characterdata.Proficiency
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.characterdata.ProficiencyFragment
import ui.view.ViewBase

class ProficiencyView(apiResourceList: APIResourceList) : ViewBase<ProficienciesAPI>(apiResourceList) {
    override val apiController: ProficienciesAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getProficiency(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return ProficiencyFragment(data as Proficiency)
    }
}