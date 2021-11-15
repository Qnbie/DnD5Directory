package ui.view.races

import apicontroller.races.SubracesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class SubraceView(apiResourceList: APIResourceList) : ViewBase<SubracesAPI>(apiResourceList) {
    override val apiController: SubracesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSubrace(index)
    }
}