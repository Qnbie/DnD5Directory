package data.equipment

import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Gear : EquipmentBase() {
    val gear_category: APIReference = APIReference()
}