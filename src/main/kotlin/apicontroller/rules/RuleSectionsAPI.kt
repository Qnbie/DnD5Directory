package apicontroller.rules

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.races.Race
import data.rules.RuleSections
import io.ktor.client.*
import io.ktor.client.request.*

class RuleSectionsAPI() : APIControllerBase() {
    override var SITE_URL = "rule-sections/"

    suspend fun getRuleSections(index: String): RuleSections {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}