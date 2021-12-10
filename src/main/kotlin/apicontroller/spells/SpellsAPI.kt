package apicontroller.spells

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.spells.Spell
import io.ktor.client.request.*

class SpellsAPI : APIControllerBase() {
    override var SITE_URL = "spells/"

    suspend fun getSpell(index: String): Spell {
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getSpellsByLevel(level: Int): APIResourceList {
        return client.get("$BASE_URL$SITE_URL?level=$level")
    }

    suspend fun getSpellsBySchool(school: String): APIResourceList {
        return client.get("$BASE_URL$SITE_URL?school=$school")
    }
}