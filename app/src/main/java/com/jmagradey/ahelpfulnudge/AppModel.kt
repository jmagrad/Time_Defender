package com.jmagradey.ahelpfulnudge

data class AppModel(
    val packageName: String,
    val appName: String,
    var isInAppJail: Boolean = false,
    var timeRemaining: Long = 0 // The remaining time for an app to stay out of App Jail
)
