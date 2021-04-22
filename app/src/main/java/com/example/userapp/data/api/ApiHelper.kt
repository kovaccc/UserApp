package com.example.userapp.data.api

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class ApiHelper @Inject constructor(private val apiServiceImpl: ApiServiceImpl) {

    suspend fun getUsers() = apiServiceImpl.loadUsers()

}