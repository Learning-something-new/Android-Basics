package com.test.androidbasics.viewmodel.di_models.koin

import com.test.androidbasics.viewmodel.defaults.DefaultRepositoryViewModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewFactoryModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewKoinModule = module {

    viewModel { DefaultViewModel() }

    // get parameter in fragment
    viewModel { DefaultViewFactoryModel(get()) }

    viewModel { DefaultRepositoryViewModel(get()) }

}