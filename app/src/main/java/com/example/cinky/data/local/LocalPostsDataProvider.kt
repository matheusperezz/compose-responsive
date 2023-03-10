package com.example.cinky.data.local

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.cinky.data.model.Post

object LocalPostsDataProvider {
    private val allPosts = listOf(
        Post(
            id = 1L,
            title = LoremIpsum(10).values.first().toString(),
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(1L),
            threads = listOf(
                Post(
                    id = 6L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(2L),
                    createdAt = "2 horas atrás"
                ),
                Post(
                    id = 7L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(3L),
                    createdAt = "2 horas atrás"
                ),
            ),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 2L,
            title = LoremIpsum(10).values.first().toString(),
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(3L),
            threads = listOf(
                Post(
                    id = 8L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(2L),
                    createdAt = "3 horas atrás"
                ),
                Post(
                    id = 9L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(1L),
                    createdAt = "2 horas atrás"
                ),
                Post(
                    id = 10L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(2L),
                    createdAt = "1 horas atrás"
                ),
                Post(
                    id = 11L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(1L),
                    createdAt = "25 minutos atrás"
                ),
            ),
            createdAt = "4 horas atrás"
        ),
        Post(
            id = 3L,
            title = LoremIpsum(10).values.first().toString(),
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(2L),
            threads = listOf(
                Post(
                    id = 12L,
                    title = LoremIpsum(10).values.first().toString(),
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(3L),
                    createdAt = "2 horas atrás"
                ),
            ),
            createdAt = "5 horas atrás"
        ),
        Post(
            id = 4L,
            title = LoremIpsum(10).values.first().toString(),
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(3L),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 5L,
            title = LoremIpsum(10).values.first().toString(),
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(1L),
            createdAt = "5 dias atrás"
        ),
    )

    fun getAllPosts(): List<Post> = allPosts

    fun getPostById(postId: Long): Post {
        return allPosts.first { it.id == postId }
    }
}