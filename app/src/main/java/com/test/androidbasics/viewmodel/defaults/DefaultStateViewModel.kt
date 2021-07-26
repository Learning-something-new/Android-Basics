package com.test.androidbasics.viewmodel.defaults

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DefaultStateViewModel(
    state: SavedStateHandle
) : ViewModel() {

    private val savedStateHandle = state
    private val _text: MutableLiveData<String> = savedStateHandle.getLiveData("text")

    val text: LiveData<String>
        get() = _text

    fun setNewText(text: String) {
        _text.value = text
        savedStateHandle.set("text", text)
    }

}