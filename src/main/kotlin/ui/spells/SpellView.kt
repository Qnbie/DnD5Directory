package ui.spells

import apicontroller.spells.SpellsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.spells.Spell
import ui.ViewBase

class SpellView(apiResourceList: APIResourceList) : ViewBase<SpellsAPI>(apiResourceList) {
    override val apiController: SpellsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getSpell(index)
    }
}