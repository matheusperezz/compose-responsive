package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.window.layout.DisplayFeature
import com.example.cinky.ui.screens.feed.CinkyFeedCompactScreen
import com.example.cinky.ui.screens.feed.CinkyFeedExpandedScreen

@Composable
fun CinkyFeedScreen(
    windowSize: WindowSizeClass,
    displayFeature: List<DisplayFeature>
) {

    when(windowSize.widthSizeClass) {

        WindowWidthSizeClass.Compact -> {
            CinkyFeedCompactScreen(postLazyListState = rememberLazyListState())
        }
        WindowWidthSizeClass.Medium -> {
            CinkyFeedExpandedScreen(postLazyListState = rememberLazyListState())
        }
        WindowWidthSizeClass.Expanded -> {
            CinkyFeedExpandedScreen(postLazyListState = rememberLazyListState())
        }
        else -> {
            CinkyFeedCompactScreen(postLazyListState = rememberLazyListState())
        }

    }

}