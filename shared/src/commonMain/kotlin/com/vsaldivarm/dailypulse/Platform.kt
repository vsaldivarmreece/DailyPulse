package com.vsaldivarm.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform