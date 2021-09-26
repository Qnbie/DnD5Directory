package views

import apicontroller.APIControllerBase
import data.commonmodels.APIReference
import data.commonmodels.APIResourceList
import javafx.beans.property.ReadOnlyListProperty
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tornadofx.View
import tornadofx.listview

class ReferenceList : View() {

    lateinit var referenceList : ReadOnlyListProperty<APIReference>

    override val root = listview(referenceList) {
        isEditable = true
        cellFragment(ReferenceItemFragment::class)
    }

}
