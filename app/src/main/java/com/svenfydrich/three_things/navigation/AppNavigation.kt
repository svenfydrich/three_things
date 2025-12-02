package com.svenfydrich.three_things.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.svenfydrich.three_things.History.HistoryScreen
import com.svenfydrich.three_things.Settings.SettingsScreen
import com.svenfydrich.three_things.Things.ThingsScreen

@PreviewScreenSizes
@Composable
fun AppNavigationHost() {
    val backStack = remember { mutableStateListOf<Any>(AppScreen.Things) }
    val currentScreen = backStack.lastOrNull()
    val destinations = listOf(AppScreen.Things, AppScreen.History, AppScreen.Settings)

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            destinations.forEach { screen ->
                item(
                    icon = {
                        Icon(
                            screen.icon,
                            contentDescription = screen.label
                        )
                    },
                    label = { Text(screen.label) },
                    selected = screen == currentScreen,
                    onClick = {
                        backStack.add(screen)
                        }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier) { innerPadding ->
            NavDisplay(
                modifier = Modifier.padding(innerPadding),
                backStack = backStack,
                onBack = { backStack.removeLastOrNull() },
                entryProvider = { key ->
                    when (key) {
                        is AppScreen.Things -> NavEntry(key) { ThingsScreen() }
                        is AppScreen.History -> NavEntry(key) { HistoryScreen() }
                        is AppScreen.Settings -> NavEntry(key) { SettingsScreen() }
                        else -> NavEntry(Unit) { Text("Unknown route") }
                    }
                }
            )
        }
    }
}
