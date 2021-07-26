package com.test.androidbasics.viewmodel.defaults

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.androidbasics.simple.repository.SimpleRepository

class DefaultRepositoryViewModel(
    simplerRepository: SimpleRepository
) : ViewModel() {
    private val _text = MutableLiveData(simplerRepository.text)

    val text: LiveData<String>
        get() = _text

    fun setNewText(text: String) {
        _text.value = text
    }
}