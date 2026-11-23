package com.example.bankingapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bankingapp.ui.home.components.CardsSection
import com.example.bankingapp.ui.home.components.CurrenciesSection
import com.example.bankingapp.ui.home.components.FinanceSection
import com.example.bankingapp.ui.home.components.WalletSection

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        WalletSection()
        CardsSection()
        Spacer(modifier = Modifier.height(16.dp))
        FinanceSection()
        CurrenciesSection()
    }
}