package apicontroller.rules

import apicontroller.APIControllerBase
import data.races.Race
import data.rules.Rule
import io.ktor.client.*
import io.ktor.client.request.*

class RulesAPI() : APIControllerBase() {
    override var SITE_URL = "rules/"

    suspend fun getRule(index: String): Rule {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}