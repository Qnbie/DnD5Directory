package apicontroller.races

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class RacesAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "races/"

    suspend fun getRace(index: String): Race{
        return client.get("$SITE_URL$BASE_URL$index")
    }

    suspend fun getSubraces(index: String): APIResourceList{
        return client.get("$SITE_URL$BASE_URL$index/subraces")
    }

    suspend fun getProficiencies (index: String): APIResourceList{
        return client.get("$SITE_URL$BASE_URL$index/proficiencies")
    }

    suspend fun getTraits (index: String): APIResourceList{
        return client.get("$SITE_URL$BASE_URL$index/traits")
    }
}