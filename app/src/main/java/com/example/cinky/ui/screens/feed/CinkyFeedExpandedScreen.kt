package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.ui.components.CinkyNavigationRail
import com.example.cinky.ui.components.CinkyPostList
import com.example.cinky.ui.components.CinkyThreadList
import com.example.cinky.ui.navigation.TOP_LEVEL_DESTINATIONS

@Composable
fun CinkyFeedExpandedScreen(
    modifier: Modifier = Modifier,
    postLazyListState: LazyListState,
) {

    val postSelected = remember { mutableStateOf(1L) }

    Row(modifier = modifier) {
//        NavigationRail(Modifier.weight(0.05f)) {
//            TOP_LEVEL_DESTINATIONS.forEach {
//                NavigationRailItem(
//                    selected = false,
//                    onClick = { /*TODO*/ },
//                    icon = {
//                        Icon(imageVector = it.selectedIcon, contentDescription = null)
//                    },
//                    label = {
//                        Text(text = it.iconText)
//                    })
//            }
//        }
        CinkyNavigationRail(topLevelDestinations = TOP_LEVEL_DESTINATIONS, Modifier.weight(0.05f))

        CinkyPostList(
            posts = LocalPostsDataProvider.getAllPosts(),
            postLazyListState = postLazyListState,
            onClick = {
                postSelected.value = it.id
            },
            modifier = Modifier.weight(0.45f)
        )

        CinkyThreadList(
            post = LocalPostsDataProvider.getPostById(postSelected.value),
            threadLazyListState = rememberLazyListState(),
            modifier = Modifier.weight(0.5f)
        )
    }
}