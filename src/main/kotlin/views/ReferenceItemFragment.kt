package views

import data.commonmodels.APIReference
import tornadofx.ListCellFragment
import tornadofx.hbox
import tornadofx.label

class ReferenceItemFragment : ListCellFragment<APIReference>(){

    val apiReference = APIReference

    override val root = hbox {
        label(apiReference.toString())
    }

}
