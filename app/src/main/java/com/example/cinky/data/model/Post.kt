package com.example.cinky.data.model

data class Post(
    val id: Long,
    val title: String,
    val content: String,
    val creator: User,
    val threads: List<Post> = emptyList(),
    val createdAt: String = ""
)
