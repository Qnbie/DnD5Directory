package ui.view.characterdata

import apicontroller.characterdata.AbilityScoresAPI
import data.characterdata.AbilityScore
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.Fragment
import ui.fragment.characterdata.AbilityScoresFragment
import ui.view.ViewBase

class AbilityScoresView(apiResourceList: APIResourceList) : ViewBase<AbilityScoresAPI>(apiResourceList) {
    override val apiController: AbilityScoresAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getAbilityScoreByIndex(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return AbilityScoresFragment(data as AbilityScore)
    }
}