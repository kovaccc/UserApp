package com.example.userapp.di

import com.example.userapp.data.api.ApiService
import com.example.userapp.utils.ResponseHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideUserService(): ApiService {
        return ApiService.create()
    }


    @Provides
    fun provideResponseHandler() = ResponseHandler()
}