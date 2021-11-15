package data.feats

import data.commonmodels.BaseModel
import data.commonmodels.Prerequisites
import kotlinx.serialization.Serializable

@Serializable
class Feat : BaseModel(){
    val prerequisites: List<Prerequisites> = emptyList()
    val desc: List<String> = emptyList()

}