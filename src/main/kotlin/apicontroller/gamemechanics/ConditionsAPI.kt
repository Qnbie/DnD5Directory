
package apicontroller.gamemechanics

import apicontroller.APIControllerBase
import data.gamemechanics.Condition
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class ConditionsAPI() : APIControllerBase() {
    override var SITE_URL = "conditions/"

    suspend fun getCondition(index: String): Condition {
        return client.get("$SITE_URL$BASE_URL$index")
    }
}