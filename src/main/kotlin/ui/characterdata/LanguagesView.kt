package ui.characterdata

import apicontroller.characterdata.LanguagesAPI
import data.characterdata.Language
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.ViewBase

class LanguagesView(apiResourceList: APIResourceList): ViewBase<LanguagesAPI>(apiResourceList) {
    override val apiController: LanguagesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getLanguage(index)
    }
}