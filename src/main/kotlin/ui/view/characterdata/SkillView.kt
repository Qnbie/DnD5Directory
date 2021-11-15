package ui.view.characterdata

import apicontroller.characterdata.SkillsAPI
import data.characterdata.Skill
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.characterdata.SkillFragment
import ui.view.ViewBase

class SkillView(apiResourceList: APIResourceList) : ViewBase<SkillsAPI>(apiResourceList) {
    override val apiController: SkillsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSkill(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return SkillFragment(data as Skill)
    }
}