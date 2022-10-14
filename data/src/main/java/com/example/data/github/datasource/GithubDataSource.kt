package com.example.data.github.datasource

import com.example.data.github.model.response.RepositoryResponse
import com.example.data.github.model.response.UserResponse

interface GithubDataSource {

    suspend fun getUserData(id: String): UserResponse
    suspend fun getUserRepositories(id: String): List<RepositoryResponse>
    suspend fun getRepository(id: String, name: String): RepositoryResponse

}