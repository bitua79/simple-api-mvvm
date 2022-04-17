package com.example.apisample.core

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel(
) : ViewModel() {

    protected val refreshing = MutableLiveData<Boolean>()
    fun refresh() {
        refreshing.value = true
    }
}