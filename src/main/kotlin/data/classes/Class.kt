package data.classes

import data.commonmodels.BaseModel
import data.commonmodels.APIReference
import data.commonmodels.Choice
import data.commonmodels.CommonLists
import kotlinx.serialization.Serializable

@Serializable
class Class {
    val hit_die: Int = 0
    val proficiency_choices: List<Choice> = emptyList()
    val proficiencies: List<APIReference> = emptyList()
    val saving_throws: List<APIReference> = emptyList()
    val starting_equipment: List<StartingEquipment> = emptyList()
    val starting_equipment_options : List<Starting_equipment_options> = emptyList()
    val class_levels : String = ""
    val multi_classing : Multi_classing = Multi_classing()
    val subclasses: CommonLists = CommonLists()
    val spellcastingClass: Spellcasting_Class = Spellcasting_Class()
    val spells: String = ""
}

@Serializable
class Spellcasting_Class {
    val level : Int = 0
    val spellcasting_ability : APIReference = APIReference()
    val info : List<Info> = emptyList()
}

@Serializable
class Info {
    val name : String = ""
    val desc : List<String> = emptyList()
}

@Serializable
class StartingEquipment {
    val equipment : Equipment = Equipment()
    val quantity : Int = 0
}

@Serializable
class Equipment : BaseModel(){}

@Serializable
class Starting_equipment_options {
    val choose : Int = 0
    val type : String = ""
    val from : List<List<From>> = emptyList()
}

@Serializable
class From {
    val equipment: Equipment = Equipment()
    val quantity : Int = 0
}
