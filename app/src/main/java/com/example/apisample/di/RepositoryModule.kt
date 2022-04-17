package com.example.apisample.di

import com.example.apisample.data.repository.AnimeDefaultRepository
import com.example.apisample.data.repository.AnimeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindsAppRepository(repos: AnimeDefaultRepository): AnimeRepository

}