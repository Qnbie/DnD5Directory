package ui.view.classes

import apicontroller.classes.ClassesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class ClassView(apiResourceList: APIResourceList) : ViewBase<ClassesAPI>(apiResourceList) {
    override val apiController: ClassesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getClass(index)
    }
}