package mouseEvents

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.PointerMatcher
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.onDrag
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerButton
import androidx.compose.ui.input.pointer.isCtrlPressed
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TutorialMouse08() {
    val windowInfo = LocalWindowInfo.current

    Column {
        var topBoxOffset by remember { mutableStateOf(Offset(0f, 0f)) }

        Box(modifier = Modifier.offset {
            IntOffset(topBoxOffset.x.toInt(), topBoxOffset.y.toInt())
        }.size(100.dp)
            .background(Color.Green)
            .onDrag { // all default: enabled = true, matcher = PointerMatcher.Primary (left mouse button)
                topBoxOffset += it
            }
        ) {
            Text(text = "Drag with LMB", modifier = Modifier.align(Alignment.Center))
        }

        var bottomBoxOffset by remember { mutableStateOf(Offset(0f, 0f)) }

        Box(modifier = Modifier.offset {
            IntOffset(bottomBoxOffset.x.toInt(), bottomBoxOffset.y.toInt())
        }.size(100.dp)
            .background(Color.LightGray)
            .onDrag(
                enabled = true,
                matcher = PointerMatcher.mouse(PointerButton.Secondary), // right mouse button
                onDragStart = {
                    println("Gray Box: drag start")
                },
                onDragEnd = {
                    println("Gray Box: drag end")
                }
            ) {
                val keyboardModifiers = windowInfo.keyboardModifiers
                bottomBoxOffset += if (keyboardModifiers.isCtrlPressed) it * 2f else it
            }
        ) {
            Text(text = "Drag with RMB,\ntry with CTRL", modifier = Modifier.align(Alignment.Center))
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TutorialMouse09() {
    var topBoxOffset by remember { mutableStateOf(Offset(0f, 0f)) }

    Box(modifier = Modifier.offset {
        IntOffset(topBoxOffset.x.toInt(), topBoxOffset.y.toInt())
    }.size(100.dp)
        .background(Color.Green)
        .pointerInput(Unit) {
            detectDragGestures(
                matcher = PointerMatcher.Primary
            ) {
                topBoxOffset += it
            }
        }
    ) {
        Text(text = "Drag with LMB", modifier = Modifier.align(Alignment.Center))
    }
}