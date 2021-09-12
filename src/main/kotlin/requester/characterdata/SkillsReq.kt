package requester.characterdata

import data.characterdata.Skill
import data.commonmodels.APIResourceList
import io.ktor.client.*
import io.ktor.client.request.*
import requester.BaseRequester

class SkillsReq(client: HttpClient) : BaseRequester(client) {

    override var SITE_URL = "skills/"

    suspend fun getSkill(index: String): Skill{
        return client.get(BASE_URL + SITE_URL + index)
    }

}