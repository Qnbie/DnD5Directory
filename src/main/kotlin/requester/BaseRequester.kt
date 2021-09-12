package requester

import data.commonmodels.APIResourceList
import io.ktor.client.*
import io.ktor.client.request.*


abstract class BaseRequester protected constructor(val client: HttpClient) {
    val BASE_URL = "https://www.dnd5eapi.co/api/"
    protected abstract var SITE_URL: String

    suspend fun getResourceList(): APIResourceList{
        return client.get(BASE_URL + SITE_URL)
    }
}