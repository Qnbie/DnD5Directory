package ui.characterdata

import apicontroller.characterdata.AlignmentsAPI
import data.characterdata.Alignment
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.monsters.Monster
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.ViewBase

class AlignmentsView(apiResourceList: APIResourceList) : ViewBase<AlignmentsAPI>(apiResourceList) {
    override val apiController: AlignmentsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getAlignment(index)
    }
}