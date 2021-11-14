package apicontroller.monsters

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.monsters.Monster
import data.races.Race
import io.ktor.client.*
import io.ktor.client.request.*

class MonstersAPI() : APIControllerBase() {
    override var SITE_URL = "monsters/"

    suspend fun getMonster(index: String): Monster {
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getMonstersByChallengeRating(challenge_rating: Int): APIResourceList {
        return client.get("$BASE_URL$SITE_URL?challenge_rating=$challenge_rating")
    }
}