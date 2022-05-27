package com.example.todo.android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    var message = MutableLiveData<String>()

    fun sendMessage(text: String) {
        message.value += text + "\n"
    }
}