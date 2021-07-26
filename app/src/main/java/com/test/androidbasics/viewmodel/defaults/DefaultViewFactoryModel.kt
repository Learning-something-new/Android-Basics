package com.test.androidbasics.viewmodel.defaults

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DefaultViewFactoryModel(
    initialText: String
) : ViewModel() {
    private val _text = MutableLiveData(initialText)

    val text: LiveData<String>
        get() = _text

    fun setNewText(text: String) {
        _text.value = text
    }
}