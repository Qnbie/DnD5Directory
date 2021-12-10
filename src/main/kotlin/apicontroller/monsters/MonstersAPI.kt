package apicontroller.monsters

import apicontroller.APIControllerBase
import data.commonmodels.APIResourceList
import data.monsters.Monster
import io.ktor.client.request.*

class MonstersAPI : APIControllerBase() {
    override var SITE_URL = "monsters/"

    suspend fun getMonster(index: String): Monster {
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getMonstersByChallengeRating(challengeRating: Int): APIResourceList {
        return client.get("$BASE_URL$SITE_URL?challenge_rating=$challengeRating")
    }
}