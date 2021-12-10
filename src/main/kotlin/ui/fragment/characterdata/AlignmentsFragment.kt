package ui.fragment.characterdata

import data.characterdata.Alignment
import tornadofx.*
import ui.fragment.FragmentBase

class AlignmentsFragment(alignment: Alignment): FragmentBase() {
    override val root = vbox{
        this += PageTitle("${alignment.name} (${alignment.abbreviation})")

        this += Description(alignment.desc)
    }
}