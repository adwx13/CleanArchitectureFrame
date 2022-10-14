package com.example.data.github.datasource

import com.example.data.github.GithubApi
import com.example.data.github.model.response.RepositoryResponse
import com.example.data.github.model.response.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GithubDataSourceImpl @Inject constructor(
    private val githubApi: GithubApi
): GithubDataSource {
    override suspend fun getUserData(id: String): UserResponse = withContext(Dispatchers.IO) {
        githubApi.getUserData(id)
    }

    override suspend fun getUserRepositories(id: String): List<RepositoryResponse> = withContext(Dispatchers.IO) {
        githubApi.getUserRepositories(id)
    }

    override suspend fun getRepository(id: String, name: String): RepositoryResponse = withContext(Dispatchers.IO) {
        githubApi.getRepository(id, name)
    }
}