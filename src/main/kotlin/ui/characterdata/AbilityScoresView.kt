package ui.characterdata

import apicontroller.characterdata.AbilityScoresAPI
import data.characterdata.AbilityScore
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import javafx.scene.Parent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.ViewBase

class AbilityScoresView(apiResourceList: APIResourceList) : ViewBase<AbilityScoresAPI>(apiResourceList) {
    override val apiController: AbilityScoresAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getAbilityScoreByIndex(index)
    }
}