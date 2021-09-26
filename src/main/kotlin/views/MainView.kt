import tornadofx.*
import views.Footer
import views.Header
import views.MainContent
import views.ReferenceList

class MainView : View("My View") {
    override val root = borderpane {
        top(Header::class)
        left(ReferenceList::class)
        center(MainContent::class)
        bottom(Footer::class)
    }
}
