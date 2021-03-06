package ui.view

import BaseStyleSheet.Companion.pageTitle
import data.commonmodels.APIResourceList
import data.commonmodels.BaseModel
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx
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

    @DelicateCoroutinesApi
    fun refreshFromApi(index: String){
        GlobalScope.launch(){
            val data = getData(index)
            withContext(Dispatchers.JavaFx){
                refresh(data)
            }
        }
    }

    abstract suspend fun getData(index: String): BaseModel

    private fun refresh(data: BaseModel){
        val tmp = DataFragment(data)
        dataFragment.replaceWith(tmp)
        dataFragment = tmp
    }

    open fun DataFragment(data: BaseModel): Fragment {
        return builderFragment {
            label (data.name){
                addClass (pageTitle)
            }
        }
    }
}
