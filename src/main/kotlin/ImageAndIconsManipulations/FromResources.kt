package ImageAndIconsManipulations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.singleWindowApplication

@Composable
fun TutorialImages01() {
    Image(
        painter = painterResource("sample.png"),
        contentDescription = "Sample",
        modifier = Modifier.fillMaxSize()
    )
}




