package data.equipment

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class MagicItem : BaseModel() {
    val equipment_category: APIReference = APIReference()
    val desc: List<String>? = null
}