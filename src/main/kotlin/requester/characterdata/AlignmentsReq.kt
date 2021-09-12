package requester.characterdata

import data.characterdata.Alignment
import io.ktor.client.*
import io.ktor.client.request.*
import requester.BaseRequester

class AlignmentsReq(client: HttpClient) : BaseRequester(client) {

    override var SITE_URL = "alignment/"

    suspend fun getAlignment(index: String) : Alignment{
        return client.get(BASE_URL + SITE_URL + index)
    }
}