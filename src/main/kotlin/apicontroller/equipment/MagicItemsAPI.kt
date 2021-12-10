package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.MagicItem
import io.ktor.client.request.*

class MagicItemsAPI : APIControllerBase() {
    override var SITE_URL = "magic-items/"

    suspend fun getMagicItem(index: String): MagicItem {
        return client.get("$BASE_URL$SITE_URL$index")
    }


}