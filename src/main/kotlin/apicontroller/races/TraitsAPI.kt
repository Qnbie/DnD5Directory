package apicontroller.races

import apicontroller.APIControllerBase
import data.races.Race
import data.races.Trait
import io.ktor.client.*
import io.ktor.client.request.*

class TraitsAPI() : APIControllerBase() {
    override var SITE_URL = "traits/"

    suspend fun getTrait(index: String): Trait {
        return client.get("$SITE_URL$BASE_URL$index")
    }
}