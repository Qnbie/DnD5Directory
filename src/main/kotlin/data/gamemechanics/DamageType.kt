package data.gamemechanics

import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class DamageType : BaseModel() {
    val desc : List<String>? = null
}