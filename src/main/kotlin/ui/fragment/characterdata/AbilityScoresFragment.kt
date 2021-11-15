package ui.fragment.characterdata

import data.characterdata.AbilityScore
import tornadofx.*
import ui.fragment.FragmentBase

class AbilityScoresFragment(abilityScore: AbilityScore): FragmentBase() {
    override val root = vbox{
        this += PageTitle("${abilityScore.full_name} (${abilityScore.name})")

        this += Description(abilityScore.desc)


    }
}