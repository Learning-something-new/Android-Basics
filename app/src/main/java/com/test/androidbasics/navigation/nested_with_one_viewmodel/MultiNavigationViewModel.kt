package com.test.androidbasics.navigation.nested_with_one_viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MultiNavigationViewModel : ViewModel() {

    private val _firstData = MutableLiveData<String>()
    val firstData: LiveData<String>
        get() = _firstData

    private val _secondData = MutableLiveData<String>()
    val secondData: LiveData<String>
        get() = _secondData

    private val _thirdData = MutableLiveData<String>()
    val thirdData: LiveData<String>
        get() = _thirdData


    fun getPreviousData() = listOf(firstData, secondData, thirdData).mapNotNull { it.value }.joinToString(separator = "\n")

    fun setFirstData(value: String) {
        _firstData.value = value
    }

    fun setSecondData(value: String) {
        _secondData.value = value
    }

    fun setThirdData(value: String) {
        _thirdData.value = value
    }
}