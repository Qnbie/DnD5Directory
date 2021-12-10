package ui

import tornadofx.*
import ui.view.mainmenu.*

class MainMenu: View() {

    override val root = vbox {
        setPrefSize(800.0, 800.0)

        button("Character Data") {
            action {
                replaceWith(CharacterDataView())
            }
        }
        button("Backgrounds") {
            action {
                replaceWith(BackgroundsSectionView())
            }
        }
        button("Classes") {
            action {
                replaceWith(ClassesView())
            }
        }
        button("Races") {
            action {
                replaceWith(RacesSectionView())
            }
        }
        button("Equipment") {
            action {
                replaceWith(EquipmentSectionView())
            }
        }
        button("Spells") {
            action {
                replaceWith(SpellsSectionView())
            }
        }
        button("Feats") {
            action {
                replaceWith(FeatsSectionView())
            }
        }
        button("Monster") {
            action {
                replaceWith(MonstersSectionView())
            }
        }
        button("Game Mechanics") {
            action {
                replaceWith(GameMechanicsView())
            }
        }
        button("Rules") {
            action {
                replaceWith(RulesSectionView())
            }
        }
    }
}
