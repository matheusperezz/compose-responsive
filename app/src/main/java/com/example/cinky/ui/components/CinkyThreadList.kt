package com.example.cinky.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinky.data.model.Post

@Composable
fun CinkyThreadList(
    post: Post,
    threadLazyListState: LazyListState,
    modifier: Modifier = Modifier,
) {
    val threads = post.threads

    Column(modifier = modifier) {
        Text(
            text = "Threads de: ${post.title}",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )

        Box {
            LazyColumn(modifier = Modifier.fillMaxSize(), state = threadLazyListState) {
                items(threads){ thread ->
                    CinkyPostThreadItem(post = thread)
                }
            }
        }
    }
}