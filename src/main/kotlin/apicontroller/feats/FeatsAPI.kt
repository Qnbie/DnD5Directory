package apicontroller.feats

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.feats.Feat
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class FeatsAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "feats/"

    suspend fun getFeat(index: String): Feat {
        return client.get("$SITE_URL$BASE_URL$index")
    }

    suspend fun getFeatsByName(name: String): APIResourceList {
        return client.get("$SITE_URL$BASE_URL?name=$name")
    }
}