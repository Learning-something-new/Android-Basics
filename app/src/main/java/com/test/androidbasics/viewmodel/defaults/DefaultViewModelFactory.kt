package com.test.androidbasics.viewmodel.defaults

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class DefaultViewModelFactory(
    private val initialText: String
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DefaultViewFactoryModel::class.java)) {
            return DefaultViewFactoryModel(initialText) as T
        }
        throw Exception("Not compatible ViewModel")
    }
}