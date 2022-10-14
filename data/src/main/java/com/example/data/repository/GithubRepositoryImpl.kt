package com.example.data.repository

import com.example.data.github.datasource.GithubDataSource
import com.example.domain.github.model.UserModel
import com.example.domain.github.repository.GithubRepository
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val githubDataSource: GithubDataSource
    ): GithubRepository {
    override suspend fun searchUserById(id: String): UserModel {
        return githubDataSource.getUserData(id).run {
            UserModel(name = name, url = url)
        }
    }


}