package apicontroller.gamemechanics

import apicontroller.APIControllerBase
import data.gamemechanics.DamageType
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class DamageTypesAPI() : APIControllerBase() {
    override var SITE_URL = "damage-types/"

    suspend fun getDamageType(index: String): DamageType {
        return client.get("$BASE_URL$SITE_URL$index")
    }
}