package apicontroller.races

import apicontroller.APIControllerBase
import data.races.Trait
import io.ktor.client.request.*

class TraitsAPI : APIControllerBase() {
    override var SITE_URL = "traits/"

    suspend fun getTrait(index: String): Trait {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}