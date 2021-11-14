package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.MagicItem
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class MagicItemsAPI() : APIControllerBase() {
    override var SITE_URL = "magic-items/"

    suspend fun getMagicItem(index: String): MagicItem {
        return client.get("$SITE_URL$BASE_URL$index")
    }


}