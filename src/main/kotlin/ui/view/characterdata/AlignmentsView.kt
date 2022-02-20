package ui.view.characterdata

import apicontroller.characterdata.AlignmentsAPI
import data.characterdata.Alignment
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.characterdata.AlignmentsFragment
import ui.view.ViewBase

class AlignmentsView(apiResourceList: APIResourceList) : ViewBase<AlignmentsAPI>(apiResourceList) {
    override val apiController: AlignmentsAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getAlignment(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return AlignmentsFragment(data as Alignment)
    }
}