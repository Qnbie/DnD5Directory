package apicontroller.spells

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.races.Race
import data.spells.Spell
import io.ktor.client.*
import io.ktor.client.request.*

class SpellsAPI(client: HttpClient) : APIControllerBase(client) {
    override var SITE_URL = "spells/"

    suspend fun getSpell(index: String): Spell {
        return client.get("$SITE_URL$BASE_URL$index")
    }

    suspend fun getSpellsByLevel(level: Int): APIResourceList {
        return client.get("$SITE_URL$BASE_URL?level=$level")
    }

    suspend fun getSpellsBySchool(school: String): APIResourceList {
        return client.get("$SITE_URL$BASE_URL?school=$school")
    }
}