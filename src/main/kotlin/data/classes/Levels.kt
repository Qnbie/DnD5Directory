package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import kotlinx.serialization.Serializable

@Serializable
class Levels {
    val index : String = ""
    val level : Int = 0
    val ability_score_bonuses : Int = 0
    val prof_bonus : Int = 0
    val features : List<APIReference> = emptyList()
    val spellcasting : Spellcasting = Spellcasting()
    // TODO val class_specific
    val class_levels : APIReference = APIReference()

}

@Serializable
class Spellcasting {
    val cantrips_known : Int = 0
    val spells_known : Int = 0
    val spell_slots_level_1 : Int = 0
    val spell_slots_level_2 : Int = 0
    val spell_slots_level_3 : Int = 0
    val spell_slots_level_4 : Int = 0
    val spell_slots_level_5 : Int = 0
    val spell_slots_level_6 : Int = 0
    val spell_slots_level_7 : Int = 0
    val spell_slots_level_8 : Int = 0
    val spell_slots_level_9 : Int = 0
}

@Serializable
class SubclassLevel : BaseModel(){
    val level: Int = 0
    val features: List<APIReference> = emptyList()
    val classAPI: APIReference = APIReference()
    val subclass: APIReference = APIReference()
}
