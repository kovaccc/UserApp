package com.example.userapp.data.repository

import com.example.userapp.data.api.ApiHelper
import com.example.userapp.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}