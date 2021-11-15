package apicontroller.classes

import apicontroller.APIControllerBase
import data.classes.Classes
import data.classes.Levels
import data.classes.MultiClassing
import data.classes.Spellcasting
import data.commonmodels.APIResourceList
import io.ktor.client.request.*

class ClassesAPI() : APIControllerBase() {
    override var SITE_URL = "classes/"

    suspend fun getClass( index: String): Classes{
        return client.get("$BASE_URL$SITE_URL$index")
    }

    suspend fun getSubclasses( index: String): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/subclasses")
    }

    suspend fun getSpells(index: String): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/spells")
    }

    suspend fun getSpellcasting(index: String): Spellcasting{
        return client.get("$BASE_URL$SITE_URL$index/spellcasting")
    }

    suspend fun getFeatures (index: String): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/features")
    }

    suspend fun getProficiencies  (index: String): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/proficiencies")
    }

    suspend fun getMultiClassing (index: String): MultiClassing{
        return client.get("$BASE_URL$SITE_URL$index/multi-classing")
    }

    suspend fun getLevels (index: String): List<Levels>{
        return client.get("$BASE_URL$SITE_URL$index/levels")
    }

    suspend fun getLevels(index: String, level: Int): Levels{
        return client.get("$BASE_URL$SITE_URL$index/levels/$level")
    }

    suspend fun getLevelFeatures(index: String, level: Int): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/levels/$level/features")
    }

    suspend fun getLevelSpells(index: String, level: Int): APIResourceList{
        return client.get("$BASE_URL$SITE_URL$index/levels/$level/spells")
    }
}