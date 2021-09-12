package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable
import data.commonmodels.Choice

@Serializable
class Feature : BaseModel() {
    val level : Int = 0
    val classAPI: APIReference = APIReference()
    val subclass: APIReference = APIReference()
    val desc: List<String> = emptyList()
    val feature_specific: Feature_specific = Feature_specific()
}

@Serializable
class Feature_specific{
    val subfeature_options: Choice = Choice()
    val expertise_options: Choice = Choice()
}