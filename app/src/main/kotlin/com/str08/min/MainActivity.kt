package com.str08.min

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}

@Composable
fun App() {
    MaterialTheme {
        var count by remember { mutableStateOf(0) }
        Column(Modifier.padding(24.dp)) {
            Text("STRØ8 Mini — Build OK")
            Spacer(Modifier.height(12.dp))
            Button(onClick = { count++ }) { Text("Tap $count") }
        }
    }
}
