package data.commonmodels

import kotlinx.serialization.Serializable

@Serializable
class APIReference : BaseModel(){
    override fun toString(): String {
        return name.toString()
    }
}
