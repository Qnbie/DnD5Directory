package ui.view.spells

import apicontroller.spells.SpellsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.spells.Spell
import tornadofx.Fragment
import ui.fragment.spells.SpellFragment
import ui.view.ViewBase

class SpellView(apiResourceList: APIResourceList) : ViewBase<SpellsAPI>(apiResourceList) {
    override val apiController: SpellsAPI by inject()

    override suspend fun getData(index: String): BaseModel {
        return apiController.getSpell(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return SpellFragment(data as Spell)
    }
}