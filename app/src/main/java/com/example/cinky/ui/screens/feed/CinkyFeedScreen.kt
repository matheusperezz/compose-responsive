package com.example.cinky.ui.screens.feed

import android.util.Log
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.window.layout.DisplayFeature
import androidx.window.layout.FoldingFeature
import com.example.cinky.ui.utils.CinkyOrientationStrategy

@Composable
fun CinkyFeedScreen(
    windowSize: WindowSizeClass,
    displayFeatures: List<DisplayFeature>,
) {


    var isHalfOpen = false
    var orientation = CinkyOrientationStrategy.HORIZONTAL
    for (feature in displayFeatures) {
        if (feature is FoldingFeature) {
            isHalfOpen = feature.state == FoldingFeature.State.HALF_OPENED
            orientation =
                if (feature.orientation == FoldingFeature.Orientation.HORIZONTAL) {
                    CinkyOrientationStrategy.HORIZONTAL
                } else {
                    CinkyOrientationStrategy.VERTICAL
                }
            break
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