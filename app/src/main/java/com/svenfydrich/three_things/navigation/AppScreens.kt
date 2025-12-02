package com.svenfydrich.three_things.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppScreen(
    val label: String,
    val icon: ImageVector,
) {
    data object Things : AppScreen("Things", Icons.AutoMirrored.Filled.List)
    data object History : AppScreen("History", Icons.Default.Refresh)
    data object Settings : AppScreen("Settings", Icons.Default.Settings)
}