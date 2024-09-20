package com.moksh.presentation.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.moksh.domain.repository.MokshRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WalletViewModel @Inject constructor(
    private val mokshRepository: MokshRepository
) : ViewModel() {
    val state = mutableStateOf("")
    init {
        state.value = mokshRepository.helloMoksh()
    }
}