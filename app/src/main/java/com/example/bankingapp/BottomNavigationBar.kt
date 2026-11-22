package com.example.bankingapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.bankingapp.data.BottomNavigation

val items = listOf(
    BottomNavigation("Home", Icons.Rounded.Home, "home"),
    BottomNavigation("Wallet", Icons.Rounded.Wallet, "wallet"),
    BottomNavigation("Notifications", Icons.Rounded.Notifications, "notifications"),
    BottomNavigation("Account", Icons.Rounded.AccountCircle, "account")
)
@Composable
fun BottomNavigationBar(navController: NavController) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    NavigationBar(containerColor = MaterialTheme.colorScheme.inverseOnSurface) {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(item.icon, contentDescription = item.title,
                    tint = MaterialTheme.colorScheme.onBackground) },
                label = { Text(item.title, color = MaterialTheme.colorScheme.onBackground) }
            )
        }
    }
}