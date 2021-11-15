package ui.fragment.feats

import data.feats.Feat
import javafx.scene.Parent
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class FeatFragment(feat: Feat): Fragment() {
    override val root = vbox{
        label {
            text(feat.name)
        }
    }
}