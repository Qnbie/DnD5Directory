package ui.view.gamemechanics

import apicontroller.gamemechanics.ConditionsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.gamemechanics.Condition
import tornadofx.Fragment
import ui.fragment.gamemechanics.ConditionFragment
import ui.view.ViewBase

class ConditionView(apiResourceList: APIResourceList) : ViewBase<ConditionsAPI>(apiResourceList) {
    override val apiController: ConditionsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getCondition(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return ConditionFragment(data as Condition)
    }
}