package com.moksh.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.moksh.presentation.ui.WalletWizzardScreen

@Composable
fun WalletWizzardGraph() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeRoutes.HomeGraph) {
        homeGraph()
    }
}

private fun NavGraphBuilder.homeGraph() {
    navigation<HomeRoutes.HomeGraph>(
        startDestination = HomeRoutes.WalletWizzardScreen,
    ) {
        composable<HomeRoutes.WalletWizzardScreen> {
            WalletWizzardScreen()
        }
    }
}
