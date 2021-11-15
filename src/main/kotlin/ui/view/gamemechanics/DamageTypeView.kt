package ui.view.gamemechanics

import apicontroller.gamemechanics.DamageTypesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class DamageTypeView(apiResourceList: APIResourceList) : ViewBase<DamageTypesAPI>(apiResourceList) {
    override val apiController: DamageTypesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getDamageType(index)
    }
}