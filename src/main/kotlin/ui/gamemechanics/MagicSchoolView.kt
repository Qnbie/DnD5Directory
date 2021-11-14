package ui.gamemechanics

import apicontroller.gamemechanics.MagicSchoolsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.gamemechanics.MagicSchool
import ui.ViewBase

class MagicSchoolView(apiResourceList: APIResourceList) : ViewBase<MagicSchoolsAPI>(apiResourceList) {
    override val apiController: MagicSchoolsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMagicSchool(index)
    }
}