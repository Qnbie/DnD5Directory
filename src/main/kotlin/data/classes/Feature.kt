package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable
import data.commonmodels.Choice

@Serializable
class Feature : BaseModel() {
    val level : Int? = null
    val classAPI: APIReference = APIReference()
    val subclass: APIReference = APIReference()
    val desc: List<String>? = null
    val feature_specific: FeatureSpecific = FeatureSpecific()
}

@Serializable
class FeatureSpecific{
    val subfeature_options: Choice<String> = Choice()
    val expertise_options: Choice<String> = Choice()
}