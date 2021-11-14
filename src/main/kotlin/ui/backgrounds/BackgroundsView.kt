package ui.backgrounds

import apicontroller.backgrounds.BackgroundsAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.APIResourceListView
import ui.ViewBase

class BackgroundsView(apiResourceList: APIResourceList) : ViewBase<BackgroundsAPI>(apiResourceList) {
    override val apiController: BackgroundsAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getBackgrounds(index)
    }
}