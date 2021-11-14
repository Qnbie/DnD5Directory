package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Levels : BaseModel() {
    val level : Int? = null
    val ability_score_bonuses : Int? = null
    val prof_bonus : Int? = null
    val features : List<APIReference>? = null
    val spellcasting : Spellcasting = Spellcasting()
    // TODO val class_specific
    val class_levels : APIReference = APIReference()

}

@Serializable
class Spellcasting {
    val cantrips_known : Int? = null
    val spells_known : Int? = null
    val spell_slots_level_1 : Int? = null
    val spell_slots_level_2 : Int? = null
    val spell_slots_level_3 : Int? = null
    val spell_slots_level_4 : Int? = null
    val spell_slots_level_5 : Int? = null
    val spell_slots_level_6 : Int? = null
    val spell_slots_level_7 : Int? = null
    val spell_slots_level_8 : Int? = null
    val spell_slots_level_9 : Int? = null
}

@Serializable
class SubclassLevel : BaseModel(){
    val level: Int? = null
    val features: List<APIReference>? = null
    val classAPI: APIReference = APIReference()
    val subclass: APIReference = APIReference()
}
