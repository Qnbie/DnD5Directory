package ui.classes

import apicontroller.classes.SubclassesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class SubclassesView(apiResourceList: APIResourceList) : ViewBase<SubclassesAPI>(apiResourceList) {
    override val apiController: SubclassesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSubclass(index)
    }
}