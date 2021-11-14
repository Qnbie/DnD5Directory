package data.commonmodels

import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Damage {
    val damage_dice: String? = null
    val damage_type: APIReference = APIReference()
}