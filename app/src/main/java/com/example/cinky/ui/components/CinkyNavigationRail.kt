package com.example.cinky.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cinky.ui.navigation.TOP_LEVEL_DESTINATIONS

@Composable
fun CinkyNavigationRail(modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxHeight()) {
        Column {
            NavigationRail() {
                TOP_LEVEL_DESTINATIONS.forEach {
                    NavigationRailItem(
                        selected = false,
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(imageVector = it.selectedIcon, contentDescription = null)
                        },
                        label = {
                            Text(text = it.iconText)
                        })
                }
            }
        }
    }
}