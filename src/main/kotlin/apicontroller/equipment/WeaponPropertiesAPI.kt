package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.WeaponProperty
import io.ktor.client.request.*

class WeaponPropertiesAPI : APIControllerBase() {
    override var SITE_URL = "weapon-properties/"

    suspend fun getWeaponProperty(index: String): WeaponProperty {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}