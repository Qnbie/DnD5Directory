package ui.monster
import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.monsters.Monster
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.ViewBase

class MonsterView(apiResourceList: APIResourceList) : ViewBase<MonstersAPI>(apiResourceList) {
    override val apiController: MonstersAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getMonster(index)
    }

}
