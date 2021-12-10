package apicontroller.characterdata

import data.characterdata.Skill
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class SkillsAPI : APIControllerBase() {

    override var SITE_URL = "skills/"

    suspend fun getSkill(index: String): Skill{
        return client.get("$BASE_URL$SITE_URL$index")
    }

}