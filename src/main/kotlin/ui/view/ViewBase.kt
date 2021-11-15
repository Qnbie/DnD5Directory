package ui.view

import BaseStyleSheet.Companion.pageTitle
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import tornadofx.*
import ui.fragment.WaitFragment

abstract class ViewBase<T: Controller>(apiResourceList: APIResourceList) : View() {

    var apiResourceListView = APIResourceListView(apiResourceList.results, ::refreshFromApi)
    abstract val apiController: T
    private var dataFragment: Fragment = WaitFragment()


    override val root = hbox {
        this+= apiResourceListView
        this+= dataFragment
    }

    fun refreshFromApi(index: String){
        runBlocking(Dispatchers.Unconfined){
            val data = GetData(index)
            withContext(Dispatchers.JavaFx){
                refresh(data)
            }
        }
    }

    private fun refresh(data: BaseModel){
        val tmp = DataFragment(data)
        dataFragment.replaceWith(tmp)
        dataFragment = tmp
    }

    abstract suspend fun GetData(index: String): BaseModel

    open fun DataFragment(data: BaseModel): Fragment {
        return builderFragment {
            label (data.name){
                addClass (pageTitle)
            }
        }
    }
}
