package com.example.bankingapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.navigation.AppNavHost
import com.example.bankingapp.navigation.BottomNavigationBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { padding ->
        AppNavHost(
            navController = navController,
            modifier = Modifier.padding(padding)
        )
    }
}