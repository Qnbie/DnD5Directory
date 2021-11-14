package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.WeaponProperty
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class WeaponPropertiesAPI() : APIControllerBase() {
    override var SITE_URL = "weapon-properties/"

    suspend fun getWeaponProperty(index: String): WeaponProperty {
        return client.get("$SITE_URL$BASE_URL$index")
    }
}