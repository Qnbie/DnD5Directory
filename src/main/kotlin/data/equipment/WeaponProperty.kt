package data.equipment

import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class WeaponProperty : BaseModel() {
    val desc: List<String>? = null
}