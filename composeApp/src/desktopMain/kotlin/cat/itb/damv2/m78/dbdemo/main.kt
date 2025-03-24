package cat.itb.damv2.m78.dbdemo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "dbdemo7",
    ) {
        App()
    }
}