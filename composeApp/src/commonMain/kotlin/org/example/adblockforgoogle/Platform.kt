package org.example.adblockforgoogle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform