package com.example.cinky.ui.screens.feed

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.window.layout.DisplayFeature
import androidx.window.layout.FoldingFeature

@Composable
fun CinkyFeedScreen(
    windowSize: WindowSizeClass,
    displayFeatures: List<DisplayFeature>,
) {

    var isHalfOpen = false
    displayFeatures.forEach { feature ->
        if (feature is FoldingFeature) {
            isHalfOpen = feature.state == FoldingFeature.State.HALF_OPENED
            return@forEach
        }
    }

    when {
        isHalfOpen -> {
            CinkyFeedTwoPaneScreen(
                postLazyListState = rememberLazyListState(),
                displayFeatures = displayFeatures
            )
        }

        windowSize.widthSizeClass == WindowWidthSizeClass.Compact -> {
            CinkyFeedCompactScreen(postLazyListState = rememberLazyListState())
        }

        windowSize.widthSizeClass == WindowWidthSizeClass.Medium -> {
            CinkyFeedExpandedScreen(postLazyListState = rememberLazyListState())
        }

        windowSize.widthSizeClass == WindowWidthSizeClass.Expanded -> {
            CinkyFeedExpandedScreen(postLazyListState = rememberLazyListState())
        }

        else -> {
            CinkyFeedCompactScreen(postLazyListState = rememberLazyListState())
        }
    }

}