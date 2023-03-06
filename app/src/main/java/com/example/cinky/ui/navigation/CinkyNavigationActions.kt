package com.example.cinky.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.TipsAndUpdates
import androidx.compose.ui.graphics.vector.ImageVector

object CinkyRoute {
    const val FEED = "Relevantes"
    const val RECENT = "Recentes"
    const val SEARCH = "Procurar"
}

data class CinkyTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconText: String
)

val destinations = listOf(
    CinkyTopLevelDestination(
        route = CinkyRoute.FEED,
        selectedIcon = Icons.Default.Home,
        iconText = "Feed"
    ),
    CinkyTopLevelDestination(
        route = CinkyRoute.RECENT,
        selectedIcon = Icons.Default.TipsAndUpdates,
        iconText = "Recentes"
    ),
    CinkyTopLevelDestination(
        route = CinkyRoute.SEARCH,
        selectedIcon = Icons.Default.Search,
        iconText = "Buscar"
    ),
)