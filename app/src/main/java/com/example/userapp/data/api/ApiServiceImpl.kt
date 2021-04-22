package com.example.userapp.data.api

import android.util.Log
import com.example.userapp.data.model.User
import com.example.userapp.utils.Resource
import com.example.userapp.utils.ResponseHandler
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiServiceImpl @Inject constructor(private val userService: ApiService, private val responseHandler: ResponseHandler) {


    suspend fun loadUsers() : Resource<List<User>> {
        return try {
            responseHandler.handleSuccess(userService.getUsers())
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }



}