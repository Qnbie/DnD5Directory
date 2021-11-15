package ui.fragment.characterdata

import BaseStyleSheet.Companion.header
import data.characterdata.AbilityScore
import tornadofx.*

class AbilityScoresFragment(abilityScore: AbilityScore): Fragment() {
    override val root = vbox{
        label {
            text("${abilityScore.full_name} (${abilityScore.name})")
            addClass(header)
        }
    }
}