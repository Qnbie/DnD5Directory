package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class AbilityBonus{
    val bonus: Int = 0
    val ability_score: APIReference = APIReference()
}
