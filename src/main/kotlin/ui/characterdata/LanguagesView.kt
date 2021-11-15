package ui.characterdata

import apicontroller.characterdata.LanguagesAPI
import apicontroller.rules.RulesAPI
import data.characterdata.Language
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.rules.Rule
import javafx.scene.Parent
import javafx.scene.control.Control
import javafx.scene.control.Label
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.ViewBase
import ui.rules.RuleView

class LanguagesView(apiResourceList: APIResourceList): ViewBase<LanguagesAPI>(apiResourceList) {
    override val apiController: LanguagesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getLanguage(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return builderFragment {
            label("adfgsdfgsdfg  " + data.name)
            var baseModel = Rule()
            baseModel.name = "dg"
            button { action { RuleView(APIResourceList()).DataFragment(baseModel).openModal() } }
        }
    }
}