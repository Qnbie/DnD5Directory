package ui.fragment.feats

import data.commonmodels.Prerequisites
import data.feats.Feat
import javafx.scene.layout.VBox
import tornadofx.*
import ui.fragment.FragmentBase

class FeatFragment(feat: Feat): FragmentBase() {
    override val root = vbox{
        this += PageTitle(feat.name)
        this += Description(feat.desc)
        this += SubTitle("Prerequisites")
        for (prerequisite in feat.prerequisites){
            this += PrerequisiteFrag(prerequisite)
        }
    }

    private fun PrerequisiteFrag(prerequisite: Prerequisites): VBox {
        return vbox {
            label(prerequisite.ability_score.name)
            label("Minimum score: ${prerequisite.minimum_score}")
        }
    }
}