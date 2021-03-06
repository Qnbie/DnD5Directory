
package apicontroller.gamemechanics

import apicontroller.APIControllerBase
import data.gamemechanics.Condition
import io.ktor.client.request.*

class ConditionsAPI : APIControllerBase() {
    override var SITE_URL = "conditions/"

    suspend fun getCondition(index: String): Condition {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}