package apicontroller.classes

import apicontroller.APIControllerBase
import data.classes.Feature
import io.ktor.client.*
import io.ktor.client.request.*

class FeaturesAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "features/"

    suspend fun getFeature(index: String) : Feature{
        return client.get("$BASE_URL$SITE_URL$index")
    }
}