package data.rules

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Rule : BaseModel() {
    val desc: String? = null
    val subsections: List<APIReference>? = null
}