package data.classes

import data.commonmodels.APIReference
import data.commonmodels.Prerequisites
import kotlinx.serialization.Serializable

@Serializable
class Subclass {
    val count : Int = 0
    val results: APIReference = APIReference()
    val subclass_flavor: String = ""
    val desc: List<String> = emptyList()
    val spells: List<SubclassSpell> = emptyList()
    val subclass_levels: String = ""
}

@Serializable
class SubclassSpell {
    val prerequisites: Prerequisites = Prerequisites()
    val spell: APIReference = APIReference()
}
