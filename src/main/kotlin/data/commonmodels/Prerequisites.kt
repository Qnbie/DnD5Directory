package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class Prerequisites {
    val ability_score : APIReference = APIReference()
    val minimum_score : Int? = null
}