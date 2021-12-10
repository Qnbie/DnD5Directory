package ui.fragment.equipment

import data.equipment.MagicItem
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class MagicItemFragment(magicItem: MagicItem): Fragment() {
    override val root = vbox {
        label {
            text(magicItem.name)
        }
    }
}