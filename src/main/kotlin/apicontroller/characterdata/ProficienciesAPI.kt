package apicontroller.characterdata

import data.characterdata.Proficiency
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class ProficienciesAPI(client: HttpClient) : APIControllerBase(client) {

    override var SITE_URL = "proficiencies/"

    suspend fun getProficiency(index: String) : Proficiency{
        return client.get("$BASE_URL$SITE_URL$index")
    }
}