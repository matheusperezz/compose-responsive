package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.window.layout.DisplayFeature
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.ui.components.CinkyThreadList
import com.google.accompanist.adaptive.TwoPane
import com.google.accompanist.adaptive.VerticalTwoPaneStrategy

@Composable
fun CinkyFeedTwoPaneScreen(
    postLazyListState: LazyListState,
    displayFeatures: List<DisplayFeature>,
) {
    val postSelected = remember { mutableStateOf(1L) }

    TwoPane(
        first = {
            CinkyThreadList(
                post = LocalPostsDataProvider.getPostById(postSelected.value),
                threadLazyListState = rememberLazyListState(),
            )
        },
        second = {
            CinkyFeedCompactScreen(postLazyListState = postLazyListState)
        },
        strategy = VerticalTwoPaneStrategy(splitFraction = 0.5f, gapHeight = 16.dp),
        displayFeatures = displayFeatures
    )
}