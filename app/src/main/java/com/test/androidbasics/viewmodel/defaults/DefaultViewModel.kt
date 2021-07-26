package com.test.androidbasics.viewmodel.defaults

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DefaultViewModel() : ViewModel() {

    private val _text = MutableLiveData("")


    val text: LiveData<String>
        get() = _text

    fun setNewText(text: String) {
        _text.value = text
    }

}