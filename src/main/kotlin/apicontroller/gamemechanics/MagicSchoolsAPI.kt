package apicontroller.gamemechanics

import apicontroller.APIControllerBase
import data.gamemechanics.MagicSchool
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class MagicSchoolsAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "magic-schools/"

    suspend fun getMagicSchool(index: String): MagicSchool {
        return client.get("$SITE_URL$BASE_URL$index")
    }
}