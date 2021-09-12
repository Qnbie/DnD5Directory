package apicontroller.characterdata

import data.characterdata.Language
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class LanguagesAPI(client: HttpClient) : APIControllerBase(client) {

    override var SITE_URL = "languages/"

    suspend fun getLanguage(index : String): Language{
        return client.get("$BASE_URL$SITE_URL$index")
    }
}