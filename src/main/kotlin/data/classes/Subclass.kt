package data.classes

import data.commonmodels.APIReference
import data.commonmodels.Prerequisites
import kotlinx.serialization.Serializable

@Serializable
class Subclass {
    val count : Int? = null
    val results: APIReference = APIReference()
    val subclass_flavor: String? = null
    val desc: List<String>? = null
    val spells: List<SubclassSpell>? = null
    val subclass_levels: String? = null
}

@Serializable
class SubclassSpell {
    val prerequisites: Prerequisites = Prerequisites()
    val spell: APIReference = APIReference()
}
