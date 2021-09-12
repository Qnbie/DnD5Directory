package data

import data.commonmodels.APIReference
import kotlinx.serialization.*

@Serializable
data class AbilityScores(
    val index: String,
    val name: String,
    val full_name: String,
    val desc: List<String>,
    val skills: List<APIReference>,
    val url: String
)