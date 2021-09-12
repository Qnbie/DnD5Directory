package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
data class AbilityBonus(
    val bonus: Int,
    val ability_score: APIReference
)
