package ui
import data.commonmodels.APIResourceList
import javafx.scene.Parent
import tornadofx.*

class MonsterView : View() {

    var monsterFragment = MonsterFragment("")
    var apiResourceListView = APIResourceListView(listOf("elso", "masodik", "harmadik"), ::refresh)

    override val root = hbox {
        this+= apiResourceListView
        this+=monsterFragment
    }

    fun refresh(monsterView:String){
        val tmp = MonsterFragment(monsterView)
        monsterFragment.replaceWith(tmp)
        monsterFragment = tmp
    }


}

class MonsterFragment(string: String) : Fragment() {
    override val root = vbox {
        label(string)
    }

}
