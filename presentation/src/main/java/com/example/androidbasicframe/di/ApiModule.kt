package com.example.androidbasicframe.di

import com.example.data.github.GithubApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ApiModule {

    const val GITHUB_URL = "https://api.github.com/"


    @Provides
    @Singleton
    fun provideGithubApi(): GithubApi {
        return Retrofit.Builder()
            .baseUrl(GITHUB_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GithubApi::class.java)
    }

}