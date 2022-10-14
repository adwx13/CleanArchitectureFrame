package com.example.androidbasicframe.ui.main

import androidx.lifecycle.viewModelScope
import com.example.androidbasicframe.ui.BaseViewModel
import com.example.domain.github.usecase.SearchUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel(
    private val searchUserUseCase: SearchUserUseCase
): BaseViewModel() {

    fun searchUserById(id: String) {
        viewModelScope.launch {
            searchUserUseCase.execute(id).let {

            }
        }
    }
}