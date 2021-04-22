package com.example.userapp.data.repository

import com.example.userapp.data.api.ApiHelper
import com.example.userapp.data.model.User
import com.example.userapp.utils.Resource
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers(): Resource<List<User>> {
        return withContext(IO) {apiHelper.getUsers()}
    }

}