package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.EquipmentCategorie
import io.ktor.client.*
import io.ktor.client.request.*

class EquipmentCategoriesAPI() : APIControllerBase() {
    override var SITE_URL = "equipment-categories/"

    suspend fun getEquipmentCategory(index: String): EquipmentCategorie {
        return client.get("$SITE_URL$BASE_URL$index")
    }


}