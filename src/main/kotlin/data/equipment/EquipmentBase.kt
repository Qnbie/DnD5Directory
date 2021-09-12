package data.equipment

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import data.commonmodels.Cost
import kotlinx.serialization.Serializable

@Serializable
open class EquipmentBase : BaseModel() {
    val equipment_category: APIReference = APIReference()
    val cost: Cost = Cost()
    val weight: Int = 0
}