package com.example.cinky.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinky.data.local.LocalPostsDataProvider
import com.example.cinky.data.model.Post

@Composable
fun CinkyPostList(
    posts: List<Post>,
    postLazyListState: LazyListState,
    modifier: Modifier = Modifier,
    onClick: (Post) -> Unit = {}
) {
    Box(modifier = modifier) {
        LazyColumn(modifier = Modifier.fillMaxSize(), state = postLazyListState) {
            items(items = posts, key = { it.id }) { post ->
                CinkyPostListItem(post = post) {
                    onClick(it)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CinkyPostListPreview() {
    CinkyPostList(
        posts = LocalPostsDataProvider.getAllPosts(),
        postLazyListState = rememberLazyListState(),
        modifier = Modifier
    )
}