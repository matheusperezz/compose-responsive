package com.example.cinky.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cinky.ui.navigation.CinkyTopLevelDestination
import com.example.cinky.ui.navigation.destinations

@Composable
fun CinkyBottomNavigationBar(
    selectedDestination: String,
    navigationTopLevelDestination: (CinkyTopLevelDestination) -> Unit
) {
    NavigationBar(
        modifier = Modifier.fillMaxWidth()
    ) {
        destinations.forEach { destination ->
            NavigationBarItem(
                selected = selectedDestination == destination.route,
                onClick = { navigationTopLevelDestination(destination) },
                icon = {
                    Icon(
                        imageVector = destination.selectedIcon,
                        contentDescription = null
                    )
                })
        }
    }
}