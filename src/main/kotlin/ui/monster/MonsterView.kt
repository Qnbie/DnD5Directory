package ui.monster
import apicontroller.monsters.MonstersAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.APIResourceListView

class MonsterView : View() {

    val monsterController: MonstersAPI by inject()
    var monsterFragment = MonsterFragment("")
    var apiResourceListView = APIResourceListView(listOf("aboleth", "acolyte", "adult-blue-dragon"), ::refresh)

    override val root = hbox {
        this+= apiResourceListView
        this+=monsterFragment
    }

    fun refresh(index:String){

        runBlocking(Dispatchers.Unconfined){
            val monsterData = monsterController.getMonster(index)
            withContext(Dispatchers.JavaFx){
                val tmp = monsterData.name?.let { MonsterFragment(it) }
                tmp?.let { monsterFragment.replaceWith(it) }
                if (tmp != null) {
                    monsterFragment = tmp
                }
            }
        }
    }
}

class MonsterFragment(string: String) : Fragment() {
    override val root = vbox {
        label(string)
    }

}
