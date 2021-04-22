package com.example.userapp.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.userapp.data.model.User
import com.example.userapp.data.repository.MainRepository
import com.example.userapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private val users = MutableLiveData<Resource<List<User>>>()

    init {
        fetchUsers()
    }

    private fun fetchUsers() {

        viewModelScope.launch {
            users.postValue(Resource.loading(null))
            users.postValue(mainRepository.getUsers())
        }

    }

    fun getUsers(): LiveData<Resource<List<User>>> {
        return users
    }

}