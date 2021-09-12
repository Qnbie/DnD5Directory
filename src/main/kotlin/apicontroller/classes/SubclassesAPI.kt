package apicontroller.classes

import apicontroller.APIControllerBase
import data.classes.Levels
import data.classes.Spellcasting
import data.classes.Subclass
import data.commonmodels.APIResourceList
import io.ktor.client.*
import io.ktor.client.request.*

class SubclassesAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "subclasses/"

    suspend fun getSubclass(index : String) : Subclass{
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getFeatures (index: String): APIResourceList {
        return client.get("$SITE_URL$BASE_URL$index/features")
    }

    suspend fun getLevels (index: String): List<Levels>{
        return client.get("$SITE_URL$BASE_URL$index/levels")
    }

    suspend fun getLevels(index: String, level: Int): Levels {
        return client.get("$SITE_URL$BASE_URL$index/levels/$level")
    }

    suspend fun getLevelFeatures(index: String, level: Int): APIResourceList{
        return client.get("$SITE_URL$BASE_URL$index/levels/$level/features")
    }
}