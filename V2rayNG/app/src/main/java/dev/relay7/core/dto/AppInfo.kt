package dev.relay7.core.dto

data class AppInfo(
    val appName: String,
    val packageName: String,
    val isSystemApp: Boolean,
    var isSelected: Int
)