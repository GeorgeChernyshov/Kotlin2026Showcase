package org.example.kotlin2026

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
