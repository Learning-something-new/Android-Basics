package com.test.androidbasics.viewmodel.di_models.hilt

import com.test.androidbasics.simple.repository.SimpleRepository
import com.test.androidbasics.simple.repository.SimpleRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object HiltViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideSimpleRepository(): SimpleRepository = SimpleRepositoryImpl()

}