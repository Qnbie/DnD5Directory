package apicontroller.races

import apicontroller.APIControllerBase
import data.classes.Class
import data.commonmodels.APIResourceList
import data.races.Subrace
import io.ktor.client.*
import io.ktor.client.request.*

class SubracesAPI() : APIControllerBase() {
    override var SITE_URL = "subraces/"

    suspend fun getSubrace( index: String): Subrace {
        return client.get("$SITE_URL$BASE_URL$index")
    }

    suspend fun getTraits (index: String): APIResourceList {
        return client.get("$SITE_URL$BASE_URL$index/traits")
    }

    suspend fun getProficiencies (index: String): APIResourceList{
        return client.get("$SITE_URL$BASE_URL$index/proficiencies")
    }


}