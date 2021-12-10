package apicontroller.characterdata

import data.characterdata.AbilityScore
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class AbilityScoresAPI : APIControllerBase() {

    override var SITE_URL = "ability-scores/"

    suspend fun getAbilityScoreByIndex(index: String): AbilityScore {
        return client.get("$BASE_URL$SITE_URL$index")
    }

}