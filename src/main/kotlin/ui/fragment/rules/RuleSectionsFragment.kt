package ui.fragment.rules

import data.rules.RuleSections
import tornadofx.*
import ui.fragment.FragmentBase

class RuleSectionsFragment(ruleSections: RuleSections): FragmentBase() {
    override val root = vbox{
        this += PageTitle(ruleSections.name)
        this += Description(listOf(ruleSections.desc))
    }
}