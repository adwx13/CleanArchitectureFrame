package com.example.domain.github.repository

import com.example.domain.github.model.UserModel

interface GithubRepository {

    suspend fun searchUserById(id: String): UserModel
}