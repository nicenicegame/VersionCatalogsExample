package com.example.versioncatalogsexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform