package com.example.androidbasicframe.di

import com.example.data.github.datasource.GithubDataSource
import com.example.data.github.datasource.GithubDataSourceImpl
import com.example.data.repository.GithubRepositoryImpl
import com.example.domain.github.repository.GithubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideGithubRepository(githubDataSourceImpl: GithubDataSourceImpl): GithubRepository {
        return GithubRepositoryImpl(
            githubDataSource = githubDataSourceImpl
        )
    }

}