package com.example.domain.github.usecase

import com.example.domain.github.repository.GithubRepository
import javax.inject.Inject

class SearchUserUseCase @Inject constructor(
    private val githubRepository: GithubRepository
    ){

    suspend fun execute(id: String) = githubRepository.searchUserById(id)
}