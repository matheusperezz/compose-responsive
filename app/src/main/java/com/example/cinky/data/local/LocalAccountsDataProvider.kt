package com.example.cinky.data.local

import com.example.cinky.data.model.User

object LocalAccountsDataProvider {
    private val allUsersAccounts = listOf(
        User(
            id = 1L,
            firstName = "Matheus",
            lastName = "Perez",
            email = "matheus@alura.com.br",
            userName = "matheusperez"
        ),
        User(
            id = 2L,
            firstName = "Alex",
            lastName = "Felipe",
            email = "alex@alura.com.br",
            userName = "alexfelipe"
        ),
        User(
            id = 3L,
            firstName = "Junior",
            lastName = "Martins",
            email = "junior@alura.com.br",
            userName = "juniormartins"
        )
    )

    fun getUserByID(userId: Long): User {
        return allUsersAccounts.first { it.id == userId }
    }
}