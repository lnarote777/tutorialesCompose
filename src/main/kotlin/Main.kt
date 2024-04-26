
import MouseEvents.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for Desktop",
        state = rememberWindowState(width = 1200.dp, height = 800.dp)
    ) {
//----------TUTORIAL IMAGENES----------
        //TutorialImages01()
        //TutorialImages02()
        //TutorialImages03()

// ----------TURORIAL MOUSE-----------
        //TutorialMouse01()
        //TutorialMouse02()
        //TutorialMouse03()
        //TutorialMouse04()
        //TutorialMouse05()
        //TutorialMouse06()
        //TutorialMouse07()
        //TutorialMouse08()
        //TutorialMouse09()



    }
}
