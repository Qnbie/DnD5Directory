package ui.view.rules

import apicontroller.rules.RulesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.rules.Rule
import tornadofx.Fragment
import ui.fragment.rules.RuleFragment
import ui.view.ViewBase

class RuleView(apiResourceList: APIResourceList) : ViewBase<RulesAPI>(apiResourceList) {
    override val apiController: RulesAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getRule(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return RuleFragment(data as Rule)
    }
}