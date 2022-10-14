package com.example.data.github

import com.example.data.github.model.response.RepositoryResponse
import com.example.data.github.model.response.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {

    @GET("users/{userid}")
    suspend fun getUserData(@Path("userid") id: String): UserResponse

    @GET("users/{userid}/repos")
    suspend fun getUserRepositories(@Path("userid") id: String): List<RepositoryResponse>

    @GET("repos/{userid}/{repository}")
    suspend fun getRepository(@Path("userid") id: String
                      ,@Path("repository") name: String) : RepositoryResponse
}