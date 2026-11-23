package com.example.bankingapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bankingapp.ui.account.AccountScreen
import com.example.bankingapp.ui.home.HomeScreen
import com.example.bankingapp.ui.notifications.NotificationsScreen
import com.example.bankingapp.ui.wallet.WalletScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Wallet.route) { WalletScreen() }
        composable(Screen.Notifications.route) { NotificationsScreen() }
        composable(Screen.Account.route) { AccountScreen() }
    }
}