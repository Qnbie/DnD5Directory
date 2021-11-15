package ui.fragment.rules

import data.rules.Rule
import tornadofx.*
import ui.fragment.FragmentBase

class RuleFragment(rule: Rule): FragmentBase() {
    override val root = vbox {
        this += PageTitle(rule.name)
        this += Description(listOf(rule.desc))
        this += SubTitle("Subsections")
        this += ResourceList(rule.subsections, fun(index:String){})
    }
}