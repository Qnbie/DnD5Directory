package ui.gamemechanics

import apicontroller.gamemechanics.DamageTypesAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.ViewBase

class DamageTypeView(apiResourceList: APIResourceList) : ViewBase<DamageTypesAPI>(apiResourceList) {
    override val apiController: DamageTypesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getDamageType(index)
    }
}