package com.svenfydrich.three_things.Things

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThingsScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Text(
            text = "Things",
            modifier = Modifier.padding(innerPadding)
        )
    }
}