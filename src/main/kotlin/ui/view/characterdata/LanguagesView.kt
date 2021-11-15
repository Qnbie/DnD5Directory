package ui.view.characterdata

import apicontroller.characterdata.LanguagesAPI
import data.characterdata.Language
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import tornadofx.*
import ui.fragment.characterdata.LanguagesFragment
import ui.view.ViewBase

class LanguagesView(apiResourceList: APIResourceList): ViewBase<LanguagesAPI>(apiResourceList) {
    override val apiController: LanguagesAPI by inject()

    override suspend fun GetData(index: String): BaseModel {
        return apiController.getLanguage(index)
    }

    override fun DataFragment(data: BaseModel): Fragment {
        return LanguagesFragment(data as Language)
    }
}