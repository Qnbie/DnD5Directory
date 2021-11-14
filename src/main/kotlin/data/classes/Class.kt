package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import data.commonmodels.Choice
import data.commonmodels.APIResourceList
import kotlinx.serialization.Serializable

@Serializable
class Class : BaseModel() {
    val hit_die: Int? = null
    val proficiency_choices: List<Choice>? = null
    val proficiencies: List<APIReference>? = null
    val saving_throws: List<APIReference>? = null
    val starting_equipment: List<StartingEquipment>? = null
    val starting_equipment_options : List<StartingEquipmentOptions>? = null
    val class_levels : String? = null
    val multi_classing : MultiClassing = MultiClassing()
    val subclasses: APIResourceList = APIResourceList()
    val spellcastingClass: SpellcastingClass = SpellcastingClass()
    val spells: String? = null
}

@Serializable
class SpellcastingClass {
    val level : Int? = null
    val spellcasting_ability : APIReference = APIReference()
    val info : List<Info>? = null
}

@Serializable
class Info {
    val name : String? = null
    val desc : List<String>? = null
}

@Serializable
class StartingEquipment {
    val equipment : Equipment = Equipment()
    val quantity : Int? = null
}

@Serializable
class Equipment : BaseModel()

@Serializable
class StartingEquipmentOptions {
    val choose : Int? = null
    val type : String? = null
    val from : List<List<From>>? = null
}

@Serializable
class From {
    val equipment: Equipment = Equipment()
    val quantity : Int? = null
}
