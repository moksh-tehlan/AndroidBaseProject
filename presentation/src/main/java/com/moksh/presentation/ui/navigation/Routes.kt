package com.moksh.presentation.ui.navigation

import kotlinx.serialization.Serializable


interface Routes

sealed interface AuthRoutes : Routes {
    @Serializable
    data object AuthGraph : AuthRoutes
}

sealed interface HomeRoutes : Routes {
    @Serializable
    data object HomeGraph : HomeRoutes

    @Serializable
    data object WalletWizzardScreen : Routes
}