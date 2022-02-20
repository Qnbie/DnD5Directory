package ui.view.gamemechanics

import apicontroller.gamemechanics.DamageTypesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.gamemechanics.DamageType
import tornadofx.Fragment
import ui.fragment.gamemechanics.DamageTypeFragment
import ui.view.ViewBase

class DamageTypeView(apiResourceList: APIResourceList) : ViewBase<DamageTypesAPI>(apiResourceList) {
    override val apiController: DamageTypesAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getDamageType(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return DamageTypeFragment(data as DamageType)
    }
}