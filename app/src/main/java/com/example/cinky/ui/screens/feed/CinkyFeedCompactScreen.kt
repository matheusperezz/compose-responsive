package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.ui.components.CinkyBottomNavigationBar
import com.example.cinky.ui.components.CinkyPostList

@Composable
fun CinkyFeedCompactScreen(
    postLazyListState: LazyListState,
    modifier: Modifier = Modifier
) {

    Column {
        CinkyPostList(
            posts = LocalPostsDataProvider.getAllPosts(),
            postLazyListState = postLazyListState,
            modifier = Modifier.weight(1f)
        )
        CinkyBottomNavigationBar(
            selectedDestination = "",
            navigationTopLevelDestination = {}
        )
    }


}