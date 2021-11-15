package ui.fragment.races

import data.races.Race
import javafx.scene.Parent
import jdk.nashorn.internal.objects.NativeRegExp.test
import tornadofx.Fragment
import tornadofx.label
import tornadofx.text
import tornadofx.vbox

class RaceFragment(race: Race): Fragment() {
    override val root = vbox {
        label {
            text(race.name)
        }
    }
}