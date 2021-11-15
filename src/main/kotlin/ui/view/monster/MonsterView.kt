package ui.view.monster
import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import ui.view.ViewBase

class MonsterView(apiResourceList: APIResourceList) : ViewBase<MonstersAPI>(apiResourceList) {
    override val apiController: MonstersAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMonster(index)
    }

}
