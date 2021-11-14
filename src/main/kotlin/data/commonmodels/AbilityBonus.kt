package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class AbilityBonus{
    val bonus: Int? = null
    val ability_score: APIReference = APIReference()
}
