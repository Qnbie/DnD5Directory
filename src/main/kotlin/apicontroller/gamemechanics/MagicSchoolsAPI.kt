package apicontroller.gamemechanics

import apicontroller.APIControllerBase
import data.gamemechanics.MagicSchool
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class MagicSchoolsAPI() : APIControllerBase() {
    override var SITE_URL = "magic-schools/"

    suspend fun getMagicSchool(index: String): MagicSchool {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}