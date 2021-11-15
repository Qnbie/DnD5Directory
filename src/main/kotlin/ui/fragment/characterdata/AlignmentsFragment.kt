package ui.fragment.characterdata

import data.characterdata.Alignment
import javafx.scene.Parent
import tornadofx.*

class AlignmentsFragment(alignment: Alignment): Fragment() {
    override val root = vbox{
        label(alignment.name)
    }
}