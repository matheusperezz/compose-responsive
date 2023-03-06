package com.example.cinky.data.local

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.cinky.data.model.Post

object LocalPostsDataProvider {
    private val allPosts = listOf(
        Post(
            id = 1L,
            title = "Fazendo um testeFazendo um testeFazendo um teste",
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(1L),
            threads = listOf(
                Post(
                    id = 6L,
                    title = "Fazendo um testeFazendo um testeFazendo um teste",
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(2L),
                    createdAt = "2 horas atrás"
                ),
                Post(
                    id = 7L,
                    title = "Fazendo um testeFazendo um testeFazendo um teste",
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(3L),
                    createdAt = "2 horas atrás"
                ),
            ),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 2L,
            title = "Fazendo um testeFazendo um testeFazendo um teste",
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(3L),
            threads = listOf(
                Post(
                    id = 8L,
                    title = "Fazendo um testeFazendo um testeFazendo um teste",
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(1L),
                    createdAt = "2 horas atrás"
                ),
                Post(
                    id = 9L,
                    title = "Fazendo um testeFazendo um testeFazendo um teste",
                    content = LoremIpsum(20).values.first().toString(),
                    creator = LocalAccountsDataProvider.getUserByID(1L),
                    createdAt = "2 horas atrás"
                ),
            ),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 3L,
            title = "Fazendo um testeFazendo um testeFazendo um teste",
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(2L),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 4L,
            title = "Fazendo um testeFazendo um testeFazendo um teste",
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(3L),
            createdAt = "2 horas atrás"
        ),
        Post(
            id = 5L,
            title = "Fazendo um testeFazendo um testeFazendo um teste",
            content = LoremIpsum(20).values.first().toString(),
            creator = LocalAccountsDataProvider.getUserByID(1L),
            createdAt = "2 horas atrás"
        ),

        )

    fun getAllPosts(): List<Post> = allPosts

    fun getPostById(postId: Long): Post {
        return allPosts.first { it.id == postId }
    }
}