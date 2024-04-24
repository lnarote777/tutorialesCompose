import ImageAndIconsManipulations.TutorialImages01
import ImageAndIconsManipulations.TutorialImages02
import ImageAndIconsManipulations.TutorialImages03
import MouseEvents.TutorialMouse01
import MouseEvents.TutorialMouse02

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
        //TutorialImages01()
        //TutorialImages02()
        //TutorialImages03()

        //TutorialMouse01()
        TutorialMouse02()
    }
}
