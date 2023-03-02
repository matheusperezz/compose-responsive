package com.example.cinky.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.data.model.Post

@Composable
fun CinkyPostDetail(
    post: Post,
    isFullScreen: Boolean = true,
    modifier: Modifier = Modifier.fillMaxSize(),
    onBackPressed: () -> Unit = {}
) {

    LazyColumn(modifier = modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {
        item {
            CinkyPostDetailAppBar(post, isFullScreen) {
                onBackPressed()
            }
        }
        items(items = post.threads, key = { it.id }) { post ->
            CinkyPostThreadItem(post)
        }
    }

}

@Preview
@Composable
fun CinkyPostDetailPreview() {
    CinkyPostDetail(post = LocalPostsDataProvider.getPostById(1L), isFullScreen = true)
}