package ui.view.characterdata

import apicontroller.characterdata.SkillsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class SkillView(apiResourceList: APIResourceList) : ViewBase<SkillsAPI>(apiResourceList) {
    override val apiController: SkillsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSkill(index)
    }
}