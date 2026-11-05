package org.example.kotlin2026

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Kotlin2026Showcase") {
        App()
    }
}
