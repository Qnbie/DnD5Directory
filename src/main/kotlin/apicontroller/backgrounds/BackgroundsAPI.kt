package apicontroller.backgrounds

import data.backgrounds.Backgrounds
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class BackgroundsAPI() : APIControllerBase() {

    override var SITE_URL= "backgrounds/"

    suspend fun getBackgrounds(index: String): Backgrounds{
        return client.get("$BASE_URL$SITE_URL$index")
    }
}