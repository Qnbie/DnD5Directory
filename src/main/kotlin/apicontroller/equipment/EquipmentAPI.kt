package apicontroller.equipment

import apicontroller.APIControllerBase
import data.equipment.Armor
import data.equipment.EquipmentPack
import data.equipment.Gear
import data.equipment.Weapon
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class EquipmentAPI() : APIControllerBase() {
    override var SITE_URL = "equipment/"

    suspend fun getWeapon(index: String): Weapon {
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getArmor(index: String): Armor {
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getEquipmentPack(index: String): EquipmentPack {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}