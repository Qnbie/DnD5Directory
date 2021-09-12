package requester.characterdata

import data.characterdata.Proficiency
import io.ktor.client.*
import io.ktor.client.request.*
import requester.BaseRequester

class ProficienciesReq(client: HttpClient) : BaseRequester(client) {

    override var SITE_URL = "proficiencies/"

    suspend fun getProficiency(index: String) : Proficiency{
        return client.get(BASE_URL + SITE_URL + index)
    }
}