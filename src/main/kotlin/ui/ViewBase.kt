package ui

import apicontroller.monsters.MonstersAPI
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import data.monsters.Monster
import javafx.scene.Parent
import javafx.scene.control.Control
import javafx.scene.control.Label
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*

abstract class ViewBase<T: Controller>(apiResourceList: APIResourceList) : View() {

    var apiResourceListView = APIResourceListView(apiResourceList.results, ::refresh)
    abstract val apiController: T
    var dataFragment = DataFragment()


    override val root = hbox {
        this+= apiResourceListView
        this+= dataFragment
    }

    fun refresh(index: String){
        runBlocking(Dispatchers.Unconfined){
            val data = GetData(index)
            withContext(Dispatchers.JavaFx){
                val tmp = DataFragment(data)
                dataFragment.replaceWith(tmp)
                dataFragment = tmp
            }
        }
    }

    abstract suspend fun GetData(index: String): BaseModel

    open fun DataFragment(data: BaseModel = BaseModel()): Fragment {
        return builderFragment { label (data.name) }
    }
}
