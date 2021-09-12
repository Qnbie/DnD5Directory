package data.equipment

import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class EquipmentPack : EquipmentBase(){
    val gear_category: APIReference = APIReference()
    val contents: List<APIReference> = emptyList()
}