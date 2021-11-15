package data.rules

import data.commonmodels.APIReference
import data.commonmodels.BaseModel
import kotlinx.serialization.Serializable

@Serializable
class Rule : BaseModel() {
    val desc: String = ""
    val subsections: List<APIReference> = emptyList()
}