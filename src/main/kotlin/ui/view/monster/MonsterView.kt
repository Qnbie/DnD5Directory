package ui.view.monster
import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.monsters.Monster
import tornadofx.Fragment
import ui.fragment.monster.MonsterFragment
import ui.view.ViewBase

class MonsterView(apiResourceList: APIResourceList) : ViewBase<MonstersAPI>(apiResourceList) {
    override val apiController: MonstersAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMonster(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return MonsterFragment(data as Monster)
    }
}
