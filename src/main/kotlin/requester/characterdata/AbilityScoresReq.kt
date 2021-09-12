package requester.characterdata

import data.characterdata.AbilityScore
import io.ktor.client.*
import io.ktor.client.request.*
import requester.BaseRequester

class AbilityScoresReq (client: HttpClient) : BaseRequester(client) {

    override var SITE_URL = "ability-scores/"

    suspend fun getAbilityScoreByIndex(index: String): AbilityScore {
        return client.get(BASE_URL + SITE_URL + index)
    }

}