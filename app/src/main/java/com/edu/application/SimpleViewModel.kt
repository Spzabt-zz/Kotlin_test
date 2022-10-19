package com.edu.application

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimpleViewModel : ViewModel() {
    private var _str = MutableLiveData("")
    val str: LiveData<String> = _str

    fun changeMessage() {
        _str.value += "Hi!, "
    }
}
