package apicontroller.rules

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.races.Race
import data.rules.RuleSections
import io.ktor.client.*
import io.ktor.client.request.*

class RuleSectionsAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "rule-sections/"

    suspend fun getRuleSections(index: String): RuleSections {
        return client.get("$SITE_URL$BASE_URL$index")
    }
}