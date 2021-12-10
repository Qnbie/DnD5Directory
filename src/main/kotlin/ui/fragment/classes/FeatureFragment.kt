package ui.fragment.classes

import data.classes.Feature
import tornadofx.Fragment
import tornadofx.label
import tornadofx.vbox

class FeatureFragment(feature: Feature): Fragment() {
    override val root = vbox{
        label(feature.name)
    }
}