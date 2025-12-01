package com.svenfydrich.three_things.History

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HistoryScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Text(
            text = "History",
            modifier = Modifier.padding(innerPadding)
        )
    }
}