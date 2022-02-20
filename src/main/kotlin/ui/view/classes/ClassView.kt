package ui.view.classes

import apicontroller.classes.ClassesAPI
import data.classes.Classes
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.classes.ClassFragment
import ui.view.ViewBase

class ClassView(apiResourceList: APIResourceList) : ViewBase<ClassesAPI>(apiResourceList) {
    override val apiController: ClassesAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getClass(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return ClassFragment(data as Classes)
    }
}