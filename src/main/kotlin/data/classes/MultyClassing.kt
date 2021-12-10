package data.classes

import data.characterdata.Proficiency
import data.commonmodels.APIReference
import data.commonmodels.Choice
import data.commonmodels.Prerequisites
import kotlinx.serialization.Serializable

@Serializable
class MultiClassing {
    val prerequisites : Prerequisites = Prerequisites()
    val proficiencies : APIReference = APIReference()
}

@Serializable
class MultiClassingPrerequisites {
    val prerequisites : List<Prerequisites>? = null
    val prerequisite_options : List<Choice<Prerequisites>>? = null
    val proficiencies: List<APIReference>? = null
    val proficiency_choices: List<Choice<Proficiency>>? = null
}