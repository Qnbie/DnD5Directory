package ui.fragment.races

import data.races.Race
import tornadofx.*

class RaceFragment(race: Race): Fragment() {
    override val root = hbox {
        label {
            text(race.name)
        }
    }
}