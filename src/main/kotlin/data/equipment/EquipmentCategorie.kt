package data.equipment

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class EquipmentCategorie : BaseModel() {
    val equipment: List<APIReference> = emptyList()
}