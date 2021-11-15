package ui.view.characterdata

import apicontroller.characterdata.AlignmentsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class AlignmentsView(apiResourceList: APIResourceList) : ViewBase<AlignmentsAPI>(apiResourceList) {
    override val apiController: AlignmentsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getAlignment(index)
    }
}