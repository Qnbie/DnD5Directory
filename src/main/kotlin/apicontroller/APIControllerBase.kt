package apicontroller

import data.commonmodels.APIResourceList
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import tornadofx.Controller

abstract class APIControllerBase protected constructor(val client: HttpClient) : Controller(){
    val BASE_URL = "https://www.dnd5eapi.co/api/"
    protected abstract var SITE_URL: String

    suspend fun getResourceList(): APIResourceList{
        return client.get(BASE_URL+SITE_URL)
    }
}