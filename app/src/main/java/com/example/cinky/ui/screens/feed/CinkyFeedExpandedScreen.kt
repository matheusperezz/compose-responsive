package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.ui.components.CinkyNavigationRail
import com.example.cinky.ui.components.CinkyPostList
import com.example.cinky.ui.components.CinkyThreadList
import com.example.cinky.ui.navigation.destinations

@Composable
fun CinkyFeedExpandedScreen(
    modifier: Modifier = Modifier,
    postLazyListState: LazyListState,
) {

    val postSelected = remember { mutableStateOf(1L) }

    Row(modifier = modifier) {

        CinkyNavigationRail(topLevelDestinations = destinations, Modifier.weight(0.05f))

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