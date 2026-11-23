package com.example.bankingapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home :
        Screen("home", "Home", Icons.Rounded.Home)

    data object Wallet :
        Screen("wallet", "Wallet", Icons.Rounded.Wallet)

    data object Notifications :
        Screen("notifications", "Notifications", Icons.Rounded.Notifications)

    data object Account :
        Screen("account", "Account", Icons.Rounded.AccountCircle)
}

val bottomNavItems = listOf(
    Screen.Home,
    Screen.Wallet,
    Screen.Notifications,
    Screen.Account
)